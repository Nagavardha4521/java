package Io_Streams;

import java.io.FileInputStream;

public class FileInputStreamDemo
{
   public static void main(String [] args)
   {
	   try
	   {
		   FileInputStream fis=new FileInputStream("abcd.txt");

		   int data;
		   while((data=fis.read())!=-1)
		   {
			   System.out.println((char)data);
		   }
		   fis.close();
		  
	
		   
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
