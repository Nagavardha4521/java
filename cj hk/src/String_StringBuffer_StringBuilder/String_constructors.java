package String_StringBuffer_StringBuilder;

public class String_constructors
{
    public static void main(String [] args)
    {
    	String s1=new String();
    	System.out.println("s1:"+s1);
    	
    	String s2=new String("naga");
    	System.out.println(s2);
    	System.out.println();
    	
    	StringBuffer sb1=new StringBuffer("vardhan");
    	String s3=new String(sb1);
        System.out.println("s3:"+s3);
        
        StringBuilder sb2=new StringBuilder("hydreabad");
        String s4=new String(sb2);
        System.out.println("s4:"+s4);
        System.out.println();
        
       char[] ca= {'a','b','c','d','e'};
       String s5=new String(ca);
       System.out.println("s5:"+s5);
       
       byte[] ba= {1,2,3,4,5};
       String s6=new String(ba);
       System.out.println("s6:"+s6);   
       System.out.println();
       
       String s7=new String(ca,1,4);
       System.out.println("s7:"+s7);
       System.out.println();
       
       String s8=new String(ba,2,3);
       System.out.println("s8:"+s8);
    }
}
