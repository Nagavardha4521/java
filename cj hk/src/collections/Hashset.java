package collections;

import java.util.HashSet;

/**
 * 1. A HashSet is a Collections framework collection, it is available from Java 1.2.
 *    It is an implementation Set interface
 *    
 * 2. We must choose HashSet for storing only unique objects in 'hash code' order as groups
 *     
 * 3. It is a non-synchronized collection 
 *  
 * 4. It is an unordered collection, does not store objects in IO and also does not use index 
 * 
 * 5. It's a implemented data structure is 'hash table backed by HashMap instance'
 * 
 * 6. Its default capacity is 16 and incremental capacity is [+1 or double]
 *    load factory is 0.75 (75%) 
 * 
 * 7. Only 'Hm, Ht, Un' objects are allowed
 * 
 * 8. null is allowed, only one null is allowed
 * 
 * 9. Objects are stored in hash code order without index
 * 
 * 10. we can retrieve objects only sequential, 
 *     random access is not possible because HashSet does not have index 
 * 
 * 11. In adding, searching and removing operations inside add(), contains() and remove() methods 
 *     hashCode(), == operator and equals() methods are called and those methods are executed 
 *     from our adding, searching and removing object's class (i.e; String/Integer/Double/Student/...)
 *     
 * 12. HashSet class constructors
 * 		1. HashSet()    
 * 		2. HashSet(Collection c)    
 * 		3. HashSet(int intialCapacity)    
 * 		4. HashSet(int intialCapacity, float loadFactor)    
 */
public class Hashset
{
   public static void main(String [] args)

   {
	   HashSet<Object> hs=new HashSet<>(16);
	   System.out.println(hs.size());
	   System.out.println(hs);
	   System.out.println();
	   
	   System.out.println(hs.add("a"));
	   hs.add("naga");
	   hs.add("true");
	   hs.add(null);
	   hs.add("a");
	   System.out.println(hs);
	   hs.add("a");
	   hs.add("b");
	   hs.add(97);
	   hs.add(98);
	   hs.add(true);
	   hs.add(6.7);
	   hs.add('p');
	   hs.add(null);
	   hs.add(0);
	   hs.add(99);
	   hs.add('c');
	   hs.add("a");
	   hs.add(97);
	   hs.add(97);
	   hs.add(null);
	   System.out.println(hs.size());
	   
	   
	   System.out.println(hs);
	   
	  
   }
}

   
