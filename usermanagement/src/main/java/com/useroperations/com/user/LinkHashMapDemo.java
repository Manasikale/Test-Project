/**
 * 
 */
package com.useroperations.com.user;

import java.util.LinkedHashMap;

/**
 * @author Manasi J. Kale
 *
 */
public class LinkHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		  hm.put("001","manasi");  
		  hm.put("002","Vaishali");  
		  hm.put("003","Janardhan");
		  hm.put("004", "Prajakta");
		  hm.put("005", "Saurabh");
		  System.out.println(hm);  
		  System.out.println("Size of the LinkedHashMap: "+hm.size());
		  hm.remove("004", "Prajakta");
		  System.out.println(hm);  
		  System.out.println("Size of the LinkedHashMap: "+hm.size());
		  hm.clear();
	      System.out.println(hm);
	      System.out.println("Size of the LinkedHashMap: "+hm.size());
	}

}
