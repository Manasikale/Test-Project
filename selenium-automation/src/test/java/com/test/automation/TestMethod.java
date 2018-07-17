/**
 * 
 */
package com.test.automation;

/**
 * @author Manasi J. Kale
 *
 */
class TestMethod
{

		   public static void main(String args[])
		   {
		      Overriding a = new Overriding();
		      
		      Overriding b = new MethodOverriding();   
		      a.move();   
		      b.move();   
		   }
}
