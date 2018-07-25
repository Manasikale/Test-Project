/**
 * 
 */
package com.useroperations.com.user;

/**
 * @author Manasi J. Kale
 *
 */
public class InterfaceDemo implements Animal1
           {
		   public void eat() 
		   {
		      System.out.println("Cat eats");
		   }

		   public void travel()
		   {
		      System.out.println("Cat travels");
		   } 
           public int noOfLegs() 
           {
		      return 2;
		   }
           public static void main(String args[])
           {
		      InterfaceDemo c = new InterfaceDemo();
		      c.eat();
		      c.travel();
		   }
           }

