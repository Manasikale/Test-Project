/**
 * 
 */
package com.useroperations.com.user;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author Manasi J. Kale
 *
 */
public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("1st", "Manasi");
        hm.put("2nd", "Janardhan");
        hm.put("3rd", "Vaishali");
        hm.put("4th", "Prajakta");
        hm.put("5th", "Saurabh");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
        hm.remove("4th");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
        Set<String> keys = hm.keySet();
        for(String key: keys)
        {
            System.out.println(key);
        }
	}

}
