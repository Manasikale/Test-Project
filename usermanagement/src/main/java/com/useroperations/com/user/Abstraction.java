package com.useroperations.com.user;

/**
 * 
 */
abstract class Abstract
{
	   public void disp()
	   {
	     System.out.println(" method of parent class");
	   }
	   abstract public void disp2();
}

class Demo extends Abstract
{
	   public void disp()
	   {
	       System.out.println("overriding abstract method");
	   }

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstraction 
{
	public static void main(String args[])
	   {
	       Demo o = new Demo();
	       o.disp();
	   }
}