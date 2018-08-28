/**
 * 
 */
package com.user.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Manasi J. Kale
 *
 */
public class MergeArray
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
{
// TODO Auto-generated method stub
		  MergeArray m = new MergeArray();
		    m.merge();
}
	public static void merge()
	{
		int[] intarray = new int[]{2,3,4,7,1,5,0,0,0,0};
		int[] array = new int[]{6,10,9,8};
		int i=0,j = intarray.length-1;
		System.out.println("1st array is::\n");
		for(i = 0;i<intarray.length;i++) 
	    {
		      System.out.print(" "+intarray[i]);
	    }     
		System.out.println("\n2nd array is::");
	    for(i=0;i<array.length;i++) 
		{
	          System.out.print("  "+array[i]);
	    }
	    System.out.println("\nMerge array is::");
	    for(i=0;i<array.length;i++)
	    {
	    	intarray[j]=array[i];
	    	j--;
	    }
	    Arrays.sort(intarray);
		for(i = 0;i<intarray.length;i++) 
	    {
	    	  Arrays.sort(intarray);
		      System.out.print(" "+intarray[i]);
	    }
	    
	    
 }
}
