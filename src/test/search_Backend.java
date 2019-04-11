package test;
import java.util.StringTokenizer;  
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class search_Backend {

	static String str;// line to be searched
	static String path="";//path in which to be searched
	
	public static String search(String who, String when, String what, String where)throws Exception
	{ 
		stringFormatting(who, when, what, where);
		BufferedReader reader = new BufferedReader( 
                new FileReader(path)); 
 
		String mystring; 
        while ((mystring = reader.readLine()) != null)
		{
        	System.out.println(mystring);
         if(str.equalsIgnoreCase(mystring))
         {
        	 System.out.println("found");
        	 reader.close();
     		//reset variables
     		path="";
     		return mystring;
         }
         else
         {
        	 System.out.println("not found");
         }
        	mystring="";
		}
        reader.close();
		return "null";
		
	}
	public static void stringFormatting(String who, String when, String what, String where)
	{
		path=where+"\\fileStorage.txt";
		str=who+" "+when+" "+what+" "+where;
		System.out.println(str);
	}	
}
