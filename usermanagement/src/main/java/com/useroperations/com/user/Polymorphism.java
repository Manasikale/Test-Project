/**
 * 
 */
package com.useroperations.com.user;
/**
 * @author Manasi J. Kale
 *
 */
class Flight
{  
	void Fly()
	  {
		  System.out.println("Flying");
	  }  
}  

class Jetairways extends Flight
{  
	void Fly()
	{
		System.out.println("Flying safely with 6000km");
	}  
}  
public class Polymorphism
{
	public static void main(String args[])
	{  
	 Flight f = new Jetairways();  
	 f.Fly();  
	}  
} 
