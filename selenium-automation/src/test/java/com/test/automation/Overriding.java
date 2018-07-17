package com.test.automation;
public class Overriding 
{

		 public void move()
		 {
		      System.out.println("First Method");
		 }
}

class MethodOverriding extends Overriding 
{
		   public void move()
		   {
		      System.out.println("Secound method");
		   }
}
