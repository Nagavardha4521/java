package com.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	    public static void riskyMethod() throws IllegalArgumentException 
	    {
	        
				new IllegalArgumentException().getMessage();
			
	    }

	    public static void main(String[] args) throws FileNotFoundException  
	    {
	  
	      
					riskyMethod();
				
	       
	    }
	}

