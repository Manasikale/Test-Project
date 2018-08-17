/**
 * 
 */
package com.user.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Manasi J. Kale
 *
 */
public class EvenOddNumber 
{
	private static Scanner sc;
	/**
	 * @param args
	 */
public static void main(String[] args)
	{
//	EvenOddNumber  eo = new EvenOddNumber();	
	int[] array=new int[10];
	sc = new Scanner(System.in);
	List<Integer> evenList = new ArrayList<>();
	List<Integer> oddList = new ArrayList<>();

		System.out.println("Enter 10 Numbers  ::");
		for(int i=0; i<array.length;i ++)
		   {
			System.out.println("Enter Number  ::");
			array[i]=sc.nextInt();
			System.out.println();
			}
		 Arrays.sort(array); 
		 System.out.println("sorted array: " + Arrays.toString(array));
		 for(int i=0;i<array.length;i++)
			{  
				if(array[i]%2==0)
					{
					evenList.add(array[i]);
					}
				if(array[i]%2!=0)
					{  
					oddList.add(array[i]);
				    }
			}
		 System.out.println("Even list : " + evenList );
		 System.out.println("Odd list : " + oddList );
}
}






































































