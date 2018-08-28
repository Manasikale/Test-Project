/**
 * 
 */
package com.user.bean;

import java.sql.Struct;

/**
 * @author Manasi J. Kale
 *
 */
public class LinkedListDemo
{
          Node head;  
          static class Node
          {
              int data;
              Node next;
              Node(int d)  
              {
            	  data = d;  
            	  next=null; 
            	  System.out.print(" "+data);
              }
		   public Object getLink()
		     {
				return null;
			 }
          }
          public boolean isCyclic()
          {
              Node fast = head;
              Node slow = head;
              while(fast!= null && fast.next != null)
              {
                  fast = fast.next.next;
                  slow = slow.next;
                  if(fast == slow )
                  {
                	  System.out.println("\n"+"LinkedList is Cyclic");
                      return true;
                  }
              }
              System.out.println("\n"+"LinkedList is Not Cyclic");
              return false;
          }
          public static void main(String[] args)
          {
        	  LinkedListDemo ll = new LinkedListDemo();
        	  	
        	  ll.head  = new Node(11);
        	  Node second = new Node(12);
        	  Node third  = new Node(13);
        	  Node fourth  = new Node(14);
        	  Node fifth  = new Node(15);
        	  
        	  ll.head.next = second;
        	  second.next = third; 
        	  third.next = fourth;
        	  fourth.next = ll.head;
        	  ll.isCyclic();
	     }
}
           