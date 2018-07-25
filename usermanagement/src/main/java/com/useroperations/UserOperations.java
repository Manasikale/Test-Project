package com.useroperations;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.user.bean.User;



public class UserOperations
{
	static List<User> userlist;
	
		public static void main(String args[])
		{
			userlist= new ArrayList<User>();
		    int choice;
		    UserOperations uo = new UserOperations();
			do
			{
		    System.out.println("1.Register User");
			System.out.println("2.View User Details");
			System.out.println("3.Display All Users");
			System.out.println("4.Exit");
			System.out.println("**********************");
			System.out.println("Please Enter Your Choice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch(choice)
			{
			case 1:
			System.out.println("Register Entry");
			uo.register();
			break;
			
			case 2:
			System.out.println("view user details");
			uo.viewUserDetails(); 
			break;
			
			case 3:
			System.out.println("Display All Users");
			uo.display();
			break;
			
			case 4:
			System.out.println("You have choose exit!");
			break;
			
			default:
			System.out.println("You entered an invalid choice");
			}
			
			}while(choice != 4);

        	}
		private static void register() 
		{
                String username;
				String birthdate;
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter registers users details: ");
			    System.out.println("Please Enter Name");
				username =sc.next();
				System.out.println("Please Enter Birthdate");
				birthdate =sc.next();	
				User u= new User( username, birthdate);
				userlist.add(u);
			}	
		private static void viewUserDetails() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter user name");
			String userName  = sc.next();
			
			boolean found = false;
			for(User u:userlist)
			{
				if(userName.equals(u.getUserName()))
				{
				 System.out.println("Username: " + u.getUserName() +"  Birthdate:- "+u.getBirthDate());
				 found = true;
				 break;
				}
			}
			
			if(!found)
			{
				System.out.println("No Matching user found");
			}
		}
		
	private static void display() 
		{
			for(User u:userlist)
			{
				System.out.println("Username: " +u.getUserName()+"  Birthdate:- "+u.getBirthDate());
			}
		}
		
} 