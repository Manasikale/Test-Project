package com.user.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortMethod 
{
	public static void main(String[] args)
	{
	    SortMethod s = new SortMethod();
	    s.sort();
	}
	
	public static void sort()
	{
	int size = 0;
	System.out.println("Enter the size of the array: ");
	Scanner sc = new Scanner(System.in);
	size = sc.nextInt();
	System.out.println("The size you enetered is " + size);
	int[] array = new int[size];
	int j = 0;
	System.out.println("Enter numbers in array::");
	System.out.println(" ::  Enter only integer value with space ::");
	while (j < size) 
	{
		try 
		{
			 array[j] = sc.nextInt();
			 } catch (Exception e) 
		{
		    System.out.println("The value you have input is not a valid integer");
		    sort();
		}
	++j;
	}
	int choice;
	do
	{
    System.out.println("\n1.Array in Ascending Order::\n");
	System.out.println("\n2.Array in Descending Order\n");
	System.out.println("\nPlease Enter Your Choice:\n");
    choice = sc.nextInt();
	
    switch(choice)
	{
	case 1:
    System.out.print("Ascending Order:");
    
    for(int i = 0;i<array.length;i++) 
    {
        Arrays.sort(array);
        System.out.print( "  "+array[i]);
    }
	break;
	
	
	case 2:
    System.out.print("Descending Order:");
    Arrays.sort(array);
    for(int i= array.length - 1; i >= 0; i--)
    {
      System.out.print( " " +array[i]);
    }
    break;

	default:
    System.out.println("You entered an invalid choice");
		
	}
	}while(choice !=2);
	}

}
