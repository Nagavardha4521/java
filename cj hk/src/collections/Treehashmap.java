package collections;

import java.util.TreeMap;

public class Treehashmap
{
      public static void main(String [] args)
      {
    	  TreeMap<Object ,Object> tm1=new TreeMap<>();
    	  tm1.put("a",1);
    	  tm1.put("b", 1);
    	  tm1.put("b",3);
    	  tm1.put("c",4);
    	  tm1.put("e",null);
    	  tm1.put("g",6);
    	  tm1.put("naga", tm1);
    	  //tm1.put(null,1);
    	  System.out.println(tm1);
      }
}
