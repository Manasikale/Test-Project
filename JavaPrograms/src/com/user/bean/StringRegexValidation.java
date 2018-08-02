/**
 * 
 */
package com.user.bean;

import java.util.Scanner;

/**
 * @author Manasi J. Kale
 *
 */
public class StringRegexValidation
{
	 private static Scanner sc;

	/**
	 * @param args
	 */
public static void main(String[] args) 
{
 // TODO Auto-generated method stub

	String username;
    String password; 
	sc = new Scanner(System.in);   
	System.out.println("Enter registers users details: ");
    System.out.println("Please Enter Name");
    username =sc.nextLine();
    if(username.matches("[a-zA-Z]+"))
    {
     System.out.println("valid Username");
     System.out.println(username);
    }
    else
    {
        System.out.println("invalid Username");
    }
    int count = 0;
    while (count<= 2) 
    {
    System.out.println("Please Enter Password");
    System.out.println("Password should contain One capital Alphabet,at least one Special Symbol,at least one numeric character......!!!!");
    password = sc.nextLine();
    if(password.matches("^(?=.*[A-Za-z0-9!@#$%]).{6,10}$"))
    {
     System.out.println("valid password");
     System.out.println(password);
     break;
    }
    else
    {
        System.out.println("invalid Password");
        count++;
    }
    }
}
}

