/**
 * 
 */
package com.useroperations.com.user;
/**
 * @author Manasi J. Kale
 *
 */
class Demo1
{
	String name;
	int hrs;
	
	public void set_work_hrs(int hrs)
	{
		this.hrs=hrs;
	}
	
	public int print_work_hours()
	{
		return hrs;
	}
}
public class Encapsulation 
{
    /**
	 * @param args
	 */
     public static void main(String[] args)
     {
		// TODO Auto-generated method stub
		Demo1 d= new Demo1();
		d.set_work_hrs(8);
		System.out.println("Number of hours:"+ d.print_work_hours());
	}
}
