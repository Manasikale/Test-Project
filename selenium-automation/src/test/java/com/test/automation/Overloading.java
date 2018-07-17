package com.test.automation;

public class Overloading 
{
	
	    public float disp(int a,int b)
	    {
	         return (a+b);
	    }
	    public float disp(float a,float b)
	    {
	         return (a+b);
	    }
	    public float disp(int a,int b,float c)
	    {
	         return (a+b+c);
	    }
	    
	    public static void main(String[] args) {
	    	Overloading o = new Overloading();
	    	System.out.println(o.disp(2, 3));
	    }
	}
	

