/**
 * 
 */
package com.user.bean;

/**
 * @author Manasi J. Kale
 *
 */
public class MaxStringOccurance
{

	/**
	 * @param args
	 */
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	 String str = "aabbccccddaedb";
     System.out.println("Maximum occurring character is " + getChar(str));
}

    static final int ASCII_SIZE = 256;
    static char getChar(String str)
    {
        int count[] = new int[ASCII_SIZE];
        for (int i=0; i<str.length(); i++)
        count[str.charAt(i)]++;
        int max = -1; 
        char result = ' '; 
        
        for (int i = 0; i <str.length(); i++)
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}




