/**
 * 
 */
package com.useroperations.com.user;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Manasi J. Kale
 *
 */
public class LinkedListDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		    ll.add("manasi");
		    ll.add("Janardhan");
		    ll.add("Vaishali");
		    ll.add("Prajakta");
		    ll.add("Saurabh");
		    System.out.println(ll);
		    System.out.println("Size of the LinkedList: "+ll.size());
		    ll.remove("Prajakta");
		    System.out.println(ll);
		    System.out.println("Size of the LinkedList: "+ll.size());
		    Collections.swap(ll, 2, 3);
		    for(String str: ll)
		    {
	            System.out.println(str);
	        }		    
	}

}
