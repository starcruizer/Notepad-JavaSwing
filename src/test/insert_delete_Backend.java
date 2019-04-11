package test;
import java.io.*;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.*;

public class insert_delete_Backend {
	
	static Scanner  x;
	static String str;
	static String path="";
	static String path_delete="";
	
	public static void insert(String who, String when, String what, String where)throws Exception
	{ 
		stringFormatting(who, when, what, where);
		File f=new File(path);
		
		if(!f.exists())
			f.createNewFile();
		
		BufferedReader in = new BufferedReader( 
                new FileReader(path)); 
 
		String mystring; 
        if ((mystring = in.readLine()) != null)
		{
        	str="\r\n"+str;
			appendStrToFile(str);
			System.out.println("Entered successfully");
		}
		else
		{
			BufferedWriter out = new BufferedWriter( 
	                new FileWriter(path));   
	        for (int i = 0; i < str.length(); i++) 
	            out.write(str.charAt(i)); 
	        out.close(); 
			System.out.println("First time entry successfully");
		}
				
		//reset variables
		path="";
		
	}
	
	
	
	public static void delete(String who, String when, String what, String where)throws Exception
	{ 
		String temp=where+"\\temp.txt";
		
		stringFormatting(who,when,what,where);
		
		File oldFile=new File(path);
		File newFile=new File(temp);
		
		BufferedReader read = new BufferedReader( 
                new FileReader(path)); 
 
		String mystring; 
        while ((mystring = read.readLine()) != null)
		{
        	if(!str.equalsIgnoreCase(mystring))
        	{
        	BufferedWriter out = new BufferedWriter( 
	                new FileWriter(temp,true));    
	            out.write(mystring+"\r\n"); 
	        out.close(); 
			System.out.println("entry successfully to temp file"); 
			
        	}
		}
        read.close();
        oldFile.delete();
        File dump=new File(path);
        newFile.renameTo(dump);
		
    } 
		
	
	
	
	
	
	
	public static void stringFormatting(String who, String when, String what, String where)
	{
		path=where+"\\fileStorage.txt";
		str=who+" "+when+" "+what+" "+where;
	}

	public static void appendStrToFile(String str) 
	{ 
		try 
		{ 	
			// Open given file in append mode. 
			BufferedWriter out = new BufferedWriter(new FileWriter(path, true)); 
			out.write(str); 
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		} 
	} 
}
