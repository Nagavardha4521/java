package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identityhashmap 
{
	public static void main(String [] args)
	{
		HashMap<Object,Object> hm=new HashMap<>();
		IdentityHashMap<Object,Object> ihm=new IdentityHashMap<>();
		hm.put(new String("a"),5);
		hm.put(new Integer(98),8);
		hm.put(new String("b"),6);
		hm.put(new Integer(97),7);
		
		hm.put(new String("a"),5);
		hm.put(new Integer(98),8);
		hm.put(new String("b"),6);
		hm.put(new Integer(97),7);
		System.out.println(hm);
		System.out.println(ihm);
		
		
	}

}
