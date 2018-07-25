/**
 * 
 */
package com.useroperations.com.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.user.bean.User;

/**
 * @author Manasi J. Kale
 *
 */
public class UserOperationHashMap {


	private static HashMap<String, String> hm;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		    hm=new HashMap<String, String>();
		    int choice;
		    UserOperationHashMap uo = new UserOperationHashMap();
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
				hm.put(username, birthdate);
                System.out.println(hm);

			}	
		private static void viewUserDetails() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter user name");
			String username  = sc.next();
			
			boolean found = false;
			for(Map.Entry me :hm.entrySet())
			{
				if(username.equals(me.getKey()))
				{
				 System.out.println("Username: " + me.getKey() +"  Birthdate:- "+me.getValue());
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
			for(Map.Entry m : hm.entrySet())
			{
				System.out.println("Username: " +m.getKey()+"  Birthdate:- "+m.getValue());
 			}
	
	}

}
