/**
 * 
 */
package com.useroperations.com.user;

import java.util.Scanner;

import com.user.bean.User;

/**
 * @author Manasi J. Kale
 *
 */
public class NumberSeries
{
	private static Scanner sc;
	/**
	 * @param args
	 */
public static void main(String[] args)
{
		// TODO Auto-generated method stub
         int i;
         int count=100;
         int[] numbers =new int[count];
         int no;
         sc = new Scanner(System.in);
	
		for(i = 1; i <= count; i++) 
         {
          System.out.print(i + "\t");
          numbers[i-1]=i;
         }
		 System.out.println("Enter Any Number:-  \t");
         no = sc.nextInt();
        
         boolean found = false;
         for(int n : numbers)
         {
             if (n == no)
             {
                 found = true;
                 break;
             }
         }
         if(found)
         {
             System.out.println(no + " Entered number is found.");
         }
         else
         {
         System.out.println(no + "Entered number is not found.");
         
         }
         }

}