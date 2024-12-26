package collections;

import java.util.EnumMap;

enum LunchItem
{
	RICE,BIRYANI,PARATA,CHAPATHI
}
public class Enumhashmap
{
      public static void main(String [] args)
      {
    	  EnumMap<LunchItem,Integer> em=new EnumMap<>(LunchItem.class);
    	  em.put(LunchItem.BIRYANI,120);
    	  em.put(LunchItem.CHAPATHI,50);
    	  em.put(LunchItem.PARATA,35);
    	  em.put(LunchItem.PARATA,50);
    	  em.put(LunchItem.RICE,150);
    	  System.out.println(LunchItem.BIRYANI+" price:"+em.get(LunchItem.BIRYANI));
    	  System.out.println(em);
    	  System.out.println(LunchItem.PARATA  + " price: " + em.get(LunchItem.PARATA));
      }
}
