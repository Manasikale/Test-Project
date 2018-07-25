package com.useroperations.com.user;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
	public static void main(String args[])
	{  
	      Map<Integer,String> hs = new HashMap<Integer, String>(); 
		  hs.put(001,"manasi");  
		  hs.put(002,"Vaishali");  
		  hs.put(003,"Janardhan");
		  hs.put(004, "Prajakta");
		  hs.put(005, "Saurabh");
		  for(Map.Entry m:hs.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		   
		  }
		  if(hs.containsValue("manasi"))
		   {
	            System.out.println("The hashmap contains value manasi");
	       } 
		   else 
		   {
	            System.out.println("The hashmap does not contains value manasi");
	       }
		 }  
       }
