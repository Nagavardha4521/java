package collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashmap 
{
	public static void main(String [] args)
	{
		HashMap<Object,Object> hm=new HashMap<>();
		WeakHashMap<Object,Object> whm=new WeakHashMap<>();
		hm.put(new String("a"),5);
		hm.put(new Integer(97),6);
		
		System.out.println(hm);
		
		System.gc();
		System.out.println(hm);
		
		
		whm.put(new String("a"), 7);
		whm.put(new Integer(97),8);
		
		
		String s2=new String("b");
		whm.put(s2,9);
		
		whm.put("c",10);
		whm.put(15,10);
		
		System.out.println(whm);
		
		System.gc();//requesting JVM to run garbage collector
		System.out.println(whm);
		
		
	     
	     
		
		
	}
   
}
