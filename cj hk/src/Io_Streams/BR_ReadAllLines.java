package Io_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BR_ReadAllLines 
{
    public static void main(String [] args) throws IOException
    {
    	BufferedReader br=new BufferedReader(new FileReader("abcd.txt"));
    	FileWriter fw=new FileWriter("bbc.txt");
    	while(br.ready())
    	{
    		fw.write(br.readLine()+"\n");
    	}
    	System.out.println("File copied");
    	br.close();
    	fw.close();
    	
    			
    }

}
