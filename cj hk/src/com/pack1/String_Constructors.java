package com.pack1;

public class String_Constructors 
{
  public static void main(String[] args)
  {
	  String s1=new String("ab");  //31*97+31*98
	  System.out.println("s1 :"+s1.hashCode());
	  
	  String s2=new String("naga");
	  System.out.println("s2:"+s2);
	  
	  StringBuffer sb1=new StringBuffer("ball");
	 System.out.println("sb1:"+sb1);
	 String s3=new String(sb1);
	 System.out.println("s3:"+s3);
	 
	 StringBuilder sb2=new StringBuilder("cricket");
	 String s4=new String(sb2);
	 System.out.println("s4:"+s4);
	 
	 char[] ca= {'a','b','c','d','e'};
	 String s5=new String(ca);
	 System.out.println("s5:"+s5);
	 
	 byte[] ba= {97,98,99,100,101,102};
	 String s6=new String(ba);
	 System.out.println("s6:"+s6);
	 
	 String s7=new String(ca,2,3);
	 System.out.println("s7:"+s7);
	 
	 String s8=new String(ba,2,3);
	 System.out.println("s8:"+s8);
	 
	 
  }
}
