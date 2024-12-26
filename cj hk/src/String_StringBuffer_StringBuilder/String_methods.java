package String_StringBuffer_StringBuilder;

public class String_methods 
{
	public static void main(String [] args)
	{
	String s1="";
	String s2=" ";
	String s3="\0";
	String s4="abc";
	
     System.out.println(s1.isEmpty()+" "+s1.isBlank()+" "+s1.length());
     System.out.println(s2.isEmpty()+" "+s2.isBlank()+" "+s2.length());
     System.out.println(s3.isEmpty()+" "+s3.isBlank()+" "+s3.length());
     System.out.println(s4.isEmpty()+" "+s4.isBlank()+" "+s4.length());
	
     System.out.println();
     
     System.out.println(s1+" "+s2+" "+s3+" "+s4);
     System.out.println();
     
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     System.out.println(s4.hashCode());
     System.out.println();
     
     
     String s5="abc";
     String s6="abc";
     String s7=new String("abc");
     String s8=new String("abc");
     
     System.out.println(s5==s6);
     System.out.println(s5.equals(s6));
     
     System.out.println(s6==s7);
     System.out.println(s5.equals(s7));
     
     String s9=("Abc");
     System.out.println(s5==s8);
     
     System.out.println(s5.equalsIgnoreCase(s9));
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
     
     s1="abc";
     s2="bbc";
     s3="adc";
     s4="abc";
     s5="abcdef";
     s6="adcdef";
      
     System.out.println(s1.compareTo(s2));
     System.out.println(s1.compareTo(s3));
     System.out.println(s1.compareTo(s4));
     System.out.println(s1.compareTo(s5));
     System.out.println(s1.compareTo(s1));
     System.out.println(s1.compareTo(s6));
     System.out.println();
     
     s1="abc";
     s2="abc";
     s3="Abc";
     StringBuffer sb1=new StringBuffer("abc");
     StringBuilder sb2=new StringBuilder("abc");
     
     System.out.println(s1.equals(sb1));
     System.out.println(s1.contentEquals(sb1));
     System.out.println(s1.contentEquals(sb2));
     System.out.println(s1.contentEquals(s3));
     System.out.println();
     
     s1="Java programming Language";
     System.out.println(s1.equals("program"));
     System.out.println(s1.contains("pro"));
     System.out.println(s1.startsWith("Java"));
     System.out.println(s1.endsWith("program"));
     System.out.println(s1.equals("Java"));
     
     System.out.println();
    
  
     
	}

}
