package com.pack1;

public class Diff_s_buffer_s_builder 
{
    public static void main(String [] args)
    {
    	String s1=new String("naga");//immutable object
    	System.out.println(s1);
    	s1.concat("vardhan");
    	System.out.println(s1);//concat methods does not store given argument characters
    	System.out.println();
    	StringBuffer sb1=new StringBuffer("naga");
    	System.out.println(sb1);
    	sb1.append(" vardhan");
    	System.out.println(sb1);
    	System.out.println();
    	StringBuilder sb2=new StringBuilder("naga");
    	System.out.println(sb2);
    	sb2.append(" vardhan");
    	System.out.println(sb2);
    	String s=new String("naga");
    	System.out.println(s);
    	
    	
    	
    }
}
