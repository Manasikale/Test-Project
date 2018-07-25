/**
 * 
 */
package com.useroperations.com.user;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Manasi J. Kale
 *
 */
public class DemoSet
{

public static void main(String args[]) 
{
	Set<String> hash_Set = new HashSet<String>();
    hash_Set.add("manasi");
    hash_Set.add("Janardhan");
    hash_Set.add("Vaishali");
    hash_Set.add("Prajakta");
    hash_Set.add("Saurabh");
    System.out.print("Display list of HashSet");

    System.out.println(hash_Set);

    System.out.print("Display list of TreeSet");
//    Set<String> tree_Set = new TreeSet<String>(hash_Set);
//    System.out.println(tree_Set);
    HashSet<String> subSet = new HashSet<String>();
    subSet.add("s1");
    subSet.add("s2");
    hash_Set.addAll(subSet);
    System.out.println(hash_Set);
	   }
	} 