package Io_Streams;

import java.io.FileWriter;

public class File_Wrtier
{
   public static void main(String [] args)
   {
	   try
	   {
		   FileWriter fw=new FileWriter("abcd.txt");
		   fw.write(66000);
		   fw.write("naga");
		   System.out.println("data is saved");
		   fw.close();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
