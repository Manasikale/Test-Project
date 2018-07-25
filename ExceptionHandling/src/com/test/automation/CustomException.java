package com.test.automation;

public class CustomException
{
	 static void validate(int age)throws InvalidAgeException
	 {  
	     if(age<18)  
	      throw new InvalidAgeException();  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[])
	   {  
	      try
	      {  
	      validate(23);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+m);
	       }  
	    }
}
