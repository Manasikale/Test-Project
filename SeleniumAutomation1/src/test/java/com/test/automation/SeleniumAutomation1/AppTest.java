package com.test.automation.SeleniumAutomation1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
	public static void main(String args[])
{
		
	Scanner userInput = new Scanner(System.in);
	int choice;
	int birthdate;
	String first_name;
	
	
	do
	{
	
    System.out.println("1.Register User");
	System.out.println("2.View User Details");
	System.out.println("3.Display All Users");
	System.out.println("4.Exit");
	System.out.println("**********************");
	System.out.println("Please Enter Your Choice:");

	choice = userInput.nextInt();

	switch(choice)
	{

	
	case 1:
	System.out.println("Register Users");
    System.out.print("Enter Number of users: ");
    
	int intNumberOfIntegers = scanner.nextInt();
    
	int intStorage[] = new int[intNumberOfIntegers];
    for(int i = 0;i < intStorage.length;i++) 
    {
	System.out.println("Please Enter Name/t Birthdate/n");
	first_name = userInput.nextInt();
	birthdate = userInput.nextInt();
	intStorage[i] = scanner.nextInt();
    }
	break;
	
	
	case 2:
	System.out.println("view user details");
	System.out.println("Please enter user Name");
	first_name = userInput.nextInt();
	System.out.println(value1 + " - " + value2 + " = " + (value1-value2);
	break;
	
	
	case 3:
	System.out.println("Display All Users");
	break;
	
	case 4:
	System.out.println("You have choose exit!");
	break;
	
	default:
	System.out.println("You entered an invalid choice");
	}
	
	}while(choice != 4);


	}
	}
