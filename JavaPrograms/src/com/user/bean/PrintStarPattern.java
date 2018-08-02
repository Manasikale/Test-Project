/**
 * 
 */
package com.user.bean;

/**
 * @author Manasi J. Kale
 *
 */
public class PrintStarPattern
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int i,j;
     for(i=5;i>=1;i--)
     {
    	 for(j=1;j<=i;j++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     for(i=2;i<=5;i++)
     {
    	 for(j=0;j<i;j++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
	}

}
