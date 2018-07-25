/**
 * 
 */
package com.useroperations.com.user;

import java.util.Hashtable;

/**
 * @author Manasi J. Kale
 *
 */
public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("1st", "Manasi");
        ht.put("2nd", "Janardhan");
        ht.put("3rd", "Vaishali");
        ht.put("4th", "Vaishali1");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());
        ht.remove("4th");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());
        if(ht.containsValue("mk"))
        {
            System.out.println("The Hashtable contains value mk");
        } 
        else
        {
            System.out.println("The Hashtable does not contains value mk");
        }
	}

}
