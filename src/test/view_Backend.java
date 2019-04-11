package test;

import java.util.StringTokenizer;  
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
public class view_Backend {
	public static String view(String data) throws IOException
	{
		

		BufferedReader reader = new BufferedReader( 
                new FileReader("fileStorage.txt"));
		String mystring, day;
		while ((mystring = reader.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(mystring," ");  
		     while (st.hasMoreTokens()) {  
		    	 st.nextToken();
		    	 day=st.nextToken();
		    	 st.nextToken();
		    	 st.nextToken();
		    	 System.out.println(day);
		    	 if(day.equalsIgnoreCase(data))
		    	 {
		    		 System.out.println("FOUND");
		    		 return mystring;
		    	 }
		     }
		}
		return "null";
	}

}
