/**
 * 
 */
package com.user.bean;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Manasi J. Kale
 *
 */
public class MoveCopyOperation
{    private static final CopyOption REPLACE_EXISTING = null;

/**
	 * @param args
     * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		//create file1 code
	    File f1 =new File("D:\\useroperation.txt");
	    
	    if(f1.createNewFile())
         {
     	System.out.println("File is created!");
         }
         else
        {
     	System.out.println("File already exists.");
         }
	    
	    
	    //move file1 code
	     FileWriter writer = new FileWriter(f1);
		 writer.write("FirstName: Manasi \n LastName: Kale \n Birthdate:2/3/96 ");
		 writer.close(); 

	     Path temp = Files.move(Paths.get("D:\\useroperation.txt"),Paths.get("D:\\newproject\\uo.txt"));       
	     if(temp != null)
	     {
	     System.out.println("File moved successfully......!!!!!");
	     }
	     else
	     {
	     System.out.println("Failed to move the file...??");
	     }	    
	     FileReader fr =new FileReader("D:\\newproject\\uo.txt");
	     int i;    
	     while((i=fr.read())!=-1)    
	     System.out.print((char)i);    
	     fr.close();   

	
          //create file2 code
	     File f2 = new File("D:\\newproject\\mk.txt");
	     if(f2.createNewFile())
         {
     	System.out.println("File is created!");
         }
         else
        {
     	System.out.println("File already exists.");
         }
	     FileWriter writer1 = new FileWriter(f2);
		 writer1.write("FirstName: janardhan \n LastName: Kale \n Birthdate:28/7/69 ");
		 writer1.close();
		 FileReader fr1 =new FileReader("D:\\newproject\\mk.txt");
	     int j;    
	     while((j=fr1.read())!=-1)    
	     System.out.print((char)j);    
	     fr1.close();
	    
		 
		 //copy file2 to file 3 code
	     File f3 = new File("D:\\newproject\\jk.txt");
	     if(f3.createNewFile())
         {
     	System.out.println("File is created!");
         }
         else
        {
     	System.out.println("File already exists.");
         }
	     FileSystemUtils.copyRecursively(f2, f3);
//	     Files.copy("D:\\newproject\\mk.txt", "D:\\newproject\\jk.txt");
	     FileReader fr2 =new FileReader("D:\\newproject\\jk.txt");
	     int m = 0;    
	     while((j=fr2.read())!=-1)    
	     System.out.print((char)m);    
	     fr2.close();   
	     
	}
}