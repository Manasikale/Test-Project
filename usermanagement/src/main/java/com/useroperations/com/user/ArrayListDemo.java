package com.useroperations.com.user;
/**
 * @author Manasi J. Kale
 *
 */
import java.util.*;
public class ArrayListDemo 
{
public static void main(String args[])
{

	List<String> newal = new ArrayList<String>();
        newal.add("Manasi");
        newal.add("Janardhan");
        newal.add("Vaishali");
        newal.add("Prajakta");
        newal.add("Saurabh1");
        System.out.println(newal);
        System.out.println("Size of the ArrayList: "+newal.size());
        newal.add("Saurabh");
        newal.remove("Saurabh1");
        System.out.println(newal);
        System.out.println("Size of the ArrayList: "+newal.size());
        Collections.reverse(newal);
        for(String str: newal)
        {
            System.out.println(str);
        }

    }
}
