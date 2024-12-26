package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylist
{
   public static void main(String[] args)
   {
	   ArrayList<Object> al=new ArrayList<Object>();
	   al.add("naga");
	   al.add(1);
	   al.add(null);
	  al.add(6.7);
	  al.add(true);
	  al.add('a');
	  
	  System.out.println(al);
	  System.out.println(al.size());
	  System.out.println();
	  
	  System.out.println(al.get(0));
	  System.out.println(al.get(5));
	  System.out.println(al.get(1));
	  System.out.println();
	  al.add(8,"naga");
	  
	  
	  for(int i=0;i<al.size();i++)
	  {
		  System.out.println(al.get(i)+" ");
	  }
	  
	  System.out.println(al.contains("naga"));
	  System.out.println(al.contains(6.7));
	  System.out.println('A');
   }
}
