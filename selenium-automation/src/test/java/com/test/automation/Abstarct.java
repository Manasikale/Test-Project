/**
 * 
 */
package com.test.automation;

 abstract class Abstract
{
	   public void disp()
	   {
	     System.out.println(" method of parent class");
	   }
	   abstract public void disp2();
}

class Demo extends Abstract
{
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   
	}
