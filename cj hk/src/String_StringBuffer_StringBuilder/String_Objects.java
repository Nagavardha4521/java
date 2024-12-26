package String_StringBuffer_StringBuilder;
//we will check how many objects will be created for the below string program
public class String_Objects 
{
          
     public static void main(String []args)
     {
    	 String s1="naga";
         
         String s2=new String("vardhan");
         String s3="naga";
         String s4=new String("vardhan");
         String s5="vardhan";

    	 System.out.println(s1==s3);
    	 System.out.println(s1==s4);
     }
  
     
     
}
