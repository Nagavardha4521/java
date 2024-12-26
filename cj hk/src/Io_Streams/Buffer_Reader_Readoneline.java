package Io_Streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer_Reader_Readoneline
{
    public static void main(String[] args)
    {
    	try
    	{
    	FileReader fr=new FileReader("abcd.txt");
    	//fr.read();
    	BufferedReader br=new BufferedReader(fr);
    	System.out.println(br.readLine());
     	System.out.println(br.readLine());
    	
     	System.out.println(br.readLine());
    	
     	System.out.println(br.readLine());
     	
     	System.out.println(br.readLine());
     	System.out.println(br.readLine());
     	System.out.println(br.readLine());
     	System.out.println(br.readLine());
    	
    	
    	
    	}
    	catch(Exception e)
    	{
    		
    		
    		e.printStackTrace();
    	}
    }
}
