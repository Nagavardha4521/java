package com.pack1;

public class Objectclass_toString_method 
{
	String x;
	String y;
	@Override
	   public String toString()
	   {
		   return x+" "+y;
	   }
	public static void main(String[] args) 
	{
		 ClassA aobj=new ClassA(10,20);
		   System.out.println(aobj);
		   aobj.toString();
		   Sample s1=new Sample("a","b");
		   System.out.println(s1);
		   String str1=new String("a");
		   System.out.println(str1);
		   System.out.println(str1.hashCode());
		   System.out.println(str1.equals(s1));
		   System.out.println(str1.toString());
		   System.out.println();
		   
		   StringBuilder sb1=new StringBuilder("a");
		   //sb1.append("b");
		   System.out.println(sb1);
		   System.out.println(sb1.hashCode());
		   System.out.println(sb1.equals(s1));
		   System.out.println(sb1.toString());
		   
		   StringBuffer sb2=new StringBuffer("naga");
		   System.out.println(sb2);
		   System.out.println(sb2.hashCode());
		   
		}
	
	}
class Sample
{
	String  x;
	String y;
     public String toString()
     {
    	 return x+" "+y;
     }
     public Sample(String x,String y)
     {
    	 this.x=x;
    	 this.y=y;
     }
}
   
   

