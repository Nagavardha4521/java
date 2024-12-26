package collections;
/**
 * 1. A HashMap is a Collections framework collection, it is available from Java 1.2v.
 *    It is an implementation Map interface
 *    
 * 2. We must choose HashMap for storing 'objects with mapping keys' in keys hash code order
 *    it means if we want to store objects in (key, value) pair format 
 *    we must choose HashMap 
 *     
 * 3. It is a non-synchronized collection 
 *  
 * 4. It is an unordered collection, does not store entries in IO and also does not use index 
 * 
 * 5. It's a implemented data structure is 'hash table'
 * 
 * 6. Its default capacity is 16 and incremental capacity is [+1 or double]
 *    load factory is 0.75 (75%) 
 * 
 * 7. it allows to store 
 * 		keys 	-> 'Hm, Ht, only Un' objects
 * 		values 	-> all 4 types objects 'Hm, Ht, Un and Du' objects
 * 
 * 8. it accepts null  
 * 		as key 		-> only null
 * 		as value 	-> multiple nulls
 * 
 * 9. Entries are stored in keys hash code order 
 * 
 * 10. we can retrieve entries 
 * 		keys 	-> only sequentially 
 * 		values 	-> randomly and also sequentially 
 * 
 * 11. In adding, searching, retrieving and removing operations inside 
 *     put(), contains(), get() and remove() methods 
 *     hashCode(), == operator and equals() methods are called and those methods are executed 
 *     from our adding, retrieving, searching and removing object's classes 
 *     (i.e; String/Integer/Double/Student/...)
 *     
 * 12. HashMap class constructors
 * 		1. HashMap()    
 * 		2. HashMap(Map c)    
 * 		3. HashMap(int intialCapacity)    
 * 		4. HashMap(int intialCapacity, float loadFactor)    
 */
import java.util.HashMap;

public class Hashmap 
{
    public static void main(String[] args)
    {
    	HashMap<Object,Object> hm=new HashMap<Object,Object>(10);
    	System.out.println(hm);
    	System.out.println(hm.size());
    	hm.put("a",1);
    	hm.put("b",2);
    	hm.put(97, 3);
    	hm.put(null,null);
    	hm.put(5, null);
    	hm.put(true, true);
    	
    	
    	System.out.println(hm);
    	
    }
}
