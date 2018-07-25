package com.useroperations.com.user;

import java.util.Scanner;

public class User
{
	private static Scanner sc;

	public static void main(String args[])
	{
			
		sc = new Scanner(System.in);
		int choice;
		String birthdate;
		String username;
		
		
		do
		{
		
	    System.out.println("1.Register User");
		System.out.println("2.View User Details");
		System.out.println("3.Display All Users");
		System.out.println("4.Exit");
		System.out.println("**********************");
		System.out.println("Please Enter Your Choice:");

		choice = sc.nextInt();

		switch(choice)
		{

		
		case 1:
		System.out.println("Register Users");
		System.out.println("Please Enter Name\n");
		username = sc.next();
		System.out.println("Please Enter  Birthdate\n");
		birthdate = sc.next();
		System.out.println("username:-\t"+username);
		System.out.println("birthdate:-\t"+birthdate);
	    break;
		
		
		case 2:
		System.out.println("view user details");
		break;
		
		
		case 3:
		System.out.println("Display All Users");
		break;
		
		case 4:
		System.out.println("You chose exit!");
		break;
		
		default:
		System.out.println("You entered an invalid choice");
		}
		
		}while(choice != 4);
	}

}
