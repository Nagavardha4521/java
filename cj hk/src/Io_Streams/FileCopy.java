package Io_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy 
{
      public static void main(String [] args)
      {
    	  try
    	  {
    	  FileInputStream fis=new FileInputStream("abcd.txt");
    	  FileOutputStream fos=new FileOutputStream("abcd1.txt");
    			  int data;
    			  while((data=fis.read())!=-1)
    			  {
    				  fos.write(data);
    			  }
    			  System.out.println("file copied");
    			  fis.close();
    			  fos.close();
    			  
    	  }
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
    	  
      }
}
