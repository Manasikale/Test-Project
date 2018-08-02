/**
 * 
 */
package com.user.bean;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Manasi J. Kale
 *
 */
public class RegexUserOperation 
{
	/**
	 * @param args
	 */
	
	static FileWriter fw;
	
public static void main(String[] args) throws IOException 
{

    int choice;
    RegexUserOperation uo = new RegexUserOperation();
    File f1 = new File("D:\\Useroperation1.txt");
    if(f1.createNewFile())
    {
	System.out.println("File is created!");
    }
    else
   {
	System.out.println("File already exists.");
    }
	
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
	
	}while(choice != 5);

	}
private static void register() throws IOException 
   {
	    fw  = new FileWriter("D:\\Useroperation1.txt", true);
	    String username;
	    String birthdate; 
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter registers users details: ");
	    System.out.println("Please Enter Name");
	    username =sc.nextLine();
	    if(username.matches("[a-zA-Z]+"))
	    {
         System.out.println("valid Username");
         fw.append(username);
        }
	    else
	    {
            System.out.println("invalid Username");
        }
	    System.out.println("Please Enter Birthdate");
	    birthdate = sc.nextLine();
	    if(birthdate.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$\r\n"))
	    {
         System.out.println("valid Birthdate");
         fw.append(birthdate);
        }
	    else
	    {
            System.out.println("invalid Birthdate");
        }       
            System.out.println();
		    fw.close();  
        
	   }
private static void viewUserDetails() throws IOException
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter user name");
	String username  = sc.nextLine();
	FileReader fr =new FileReader("D:\\Useroperation1.txt");
	fr.close();
	BufferedReader br;
	String Line= "";
	try
	{
		br = new BufferedReader(new FileReader("D:\\Useroperation1.txt"));    
		while ((Line= br.readLine()) !=null)
		{    
			String[] name = Line.split(username);    
		    System.out.println("Entered UserName is...." + username+ " BirthDate is...." + name[1]);  
		}
	}
	finally {}
	
}
private static void display() throws IOException 
{
	System.out.println("All contents are:");
	System.out.println();
    FileReader fr =new FileReader("D:\\Useroperation1.txt");
    int i;    
    while((i=fr.read())!=-1)
    System.out.print((char)i);
    System.out.println();
    fr.close();    
}
}
