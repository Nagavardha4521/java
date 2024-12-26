package com.pack1;

public class String_methods 
{
     public static void main(String [] args)
     {
    	 String s1="";
    	 String s2=" ";
    	 String s3="\0";
    	 String s4="abc";
    	 
    	 System.out.println(s1.length());
    	 System.out.println(s2.length());
    	 System.out.println(s3.length());
    	 System.out.println(s4.length());    
    	 
    	 System.out.println(s1.isEmpty()+"\t"+s1.isBlank()+"\t"+s1.length());
    	 System.out.println(s2.isEmpty()+"\t"+s2.isBlank()+"\t"+s2.length());
    	 System.out.println(s3.isEmpty()+"\t"+s3.isBlank()+"\t"+s3.length());
    	 System.out.println(s4.isEmpty()+"\t"+s4.isBlank()+"\t"+s4.length());
    	 System.out.println(s2+""+s3);
    	 System.out.println();
    	 
    	 System.out.println(s1.hashCode());
    	 System.out.println(s2.hashCode());
    	 System.out.println(s3.hashCode());
    	 System.out.println(s4.hashCode());
    	 System.out.println();
    	 
    	 String s5="abc";
    	 String s6="abc";
    	 String s7=new String("abc");
    	 
    	 System.out.println(s5==s6);
    	 System.out.println(s5.equals(s6));
    	 
    	 System.out.println(s5==s7);
    	 System.out.println(s5.equals(s6));
    	 
    	 String s8="Abc";
    	 System.out.println(s5==s8);//java is case sensitive
    	 System.out.println(s5.equals(s8));
    	 
    	 
    	 System.out.println(s5.equalsIgnoreCase(s8));
    	 System.out.println();
    	 
    	 s1="a";
    	 s2="a";
    	 s3="b";
    	 s4="A";
    	 System.out.println(s1.compareTo(s2));
    	 System.out.println(s1.compareTo(s3));
    	 System.out.println(s1.compareTo(s4));
    	 System.out.println(s1.compareToIgnoreCase(s4));
    	 System.out.println();
    	 
    	 s1="abc";   //3
    	 s2="def";
    	 s3="adc";
    	 s4="abc";
    	 s5="abcdef";    //6  s5s1 -3
    	 s6="adcdef";
    	 
    	 System.out.println(s1.compareTo(s2));
    	 System.out.println(s1.compareTo(s3));
    	 System.out.println(s1.compareTo(s4));
    	 System.out.println(s1.compareTo(s5));
    	 System.out.println(s1.compareTo(s1));
    	 System.out.println(s1.compareTo(s6));
    	 
     }
}
