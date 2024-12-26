package String_StringBuffer_StringBuilder;

public class Diff_String_SB_SB 
{
      public static void main(String [] args)
      {
    	  String s1="naga";
    	  System.out.println(s1);
    	  s1.concat("vardnan");
    	  System.out.println(s1);
    	  System.out.println();
  //============================================================================
    	  
    	  StringBuffer sb1=new StringBuffer("naga");
    	  System.out.println(sb1);
    	  sb1.append(" vardhan");
    	  System.out.println(sb1);
    	  System.out.println();
 //=============================================================================   	  
    	  StringBuilder sb2=new StringBuilder("naga");
    	  System.out.println(sb2);
    	  sb2.append(" vardhan");
    	  System.out.println(sb2);
    	  
    	  
      }
}

