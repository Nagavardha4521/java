package Io_Streams;

import java.io.FileOutputStream;
import java.util.Arrays;

public class FileOutPutStream 
{
     public static void main(String [] args)
     {
    	 try
    	 {
    	 FileOutputStream fos=new FileOutputStream("abcd.txt");
    	 fos.write(97);
    	 fos.write(98);
    	 fos.write(99);
    	 fos.write(100);
    	 fos.write(345678);
    	 fos.write("naga".getBytes());
    	 System.out.println(Arrays.toString("naga".getBytes()));
    	 System.out.println("data saved");
    	 fos.close();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
