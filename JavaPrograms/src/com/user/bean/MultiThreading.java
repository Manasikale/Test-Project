/**
 * 
 */
package com.user.bean;

/**
 * @author Manasi J. Kale
 *
 */
public class MultiThreading 
{
	/**
	 * @param args
	 */
public static void main(String[] args) 
{
	Threading t = new Threading();
    Producer p1 = new Producer(t , 1);
    Consumer c1 = new Consumer(t , 1);
    p1.start(); 
    c1.start();
}
}
class Threading
{
		   private int contents;
		   private boolean available = false;
		   
		   public synchronized int get()  
		   {
		      while (available == false)
		      {
		         try 
		         {
		            wait();
		         } catch (InterruptedException e) 
		         {}
		      }
		      available = false;
		      notifyAll();
		      return contents;
		   }
		   public synchronized void put(int value) 
		   {
		      while (available == true)
		      {
		         try 
		         {
		            wait();
		         } catch (InterruptedException e)
		         { } 
		      }
		      contents = value;
		      available = true;
		      notifyAll();
		   }
		}
		class Consumer extends Thread
		{
		   private Threading t1;
		   private int number;
		   
		   public Consumer(Threading t, int number)
		   {
		      t1 = t;
		      this.number = number;
		   }
		   public void run() 
		   {
		      int value = 0;
		      for (int i = 0; i <=5; i++)
		      {
		         value = t1.get();
		         System.out.println("Consumer #" + this.number + " got: " + value);
		      }
		   }
		}
		class Producer extends Thread 
		{
		   private Threading t2;
		   private int number;
		   public Producer(Threading t , int number) 
		   {
		      t2= t;
		      this.number = number;
		   } 
		   public void run()
		   {
		      for (int i = 0; i<=5; i++) 
		      {
		         t2.put(i);
		         System.out.println("Producer #" + this.number + " put: " + i);
		         try 
		         {
		            sleep((int)(Math.random() * 100));
		         } catch (InterruptedException e)
		         { }
		      } 
		   }
		} 