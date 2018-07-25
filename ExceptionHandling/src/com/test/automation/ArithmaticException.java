package com.test.automation;

public class ArithmaticException
{
	public static void main(String args[])
	  {
	      int num1, num2;
	      try 
	      {
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	      }
	      catch (ArithmeticException e)
	      { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) 
	      {
	         System.out.println("Exception occurred");
	      }
	   }
	
}
