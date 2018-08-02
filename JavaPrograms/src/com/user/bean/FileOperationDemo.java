/**
 * 
 */
package com.user.bean;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Manasi J. Kale
 *
 */
public class FileOperationDemo
{
     /**
	 * @param args
     * @throws IOException 
	 */
public static void main(String[] args) throws IOException
{
		
	File f1 = new File("D:\\newtextfile.txt");
	
	if(f1.createNewFile())
	{
		System.out.println("File is created!");
	}
	else
	{
		System.out.println("File already exists.");
	}
	FileWriter writer = new FileWriter(f1);
	writer.write("FirstName: Manasi \n LastName: Kale \n Birthdate:2/3/96 ");
	writer.close(); 
	System.out.println("file contents are:");
    FileReader fr =new FileReader("D:\\newtextfile.txt");
    int i;    
    while((i=fr.read())!=-1)    
    System.out.print((char)i);    
    fr.close();    
//	Desktop d = Desktop.getDesktop();
//	if(f1.exists()) d.open(f1);
			
}
}
