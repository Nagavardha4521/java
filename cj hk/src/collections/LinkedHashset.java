package collections;

import java.util.LinkedHashSet;

/**
 * 1. A LinkedHashSet is a Collections framework collection, it is available from Java 1.4v.
 *    It is a sub class of HashSet class
 *    
 * 2. We must choose LinkedHashSet for storing only unique objects in 'insertion order'
 *     
 * 3. It is a non-synchronized collection 
 *  
 * 4. It is an ordered collection, stores objects in IO without index 
 * 
 * 5. It's a implemented data structure is 
 *     'doubly-linked list and hash table backed by LinkedHashMap instance'
 * 
 * 6. Its default capacity is 16 and incremental capacity is [+1 or double]
 *    load factory is 0.75 (75%) 
 * 
 * 7. Only 'Hm, Ht, Un' objects are allowed
 * 
 * 8. null is allowed, only one null is allowed
 * 
 * 9. Objects are stored in insertion without index
 * 
 * 10. we can retrieve objects only sequential, 
 *     random access is not possible because HashSet does not have index 
 * 
 * 11. In adding, searching and removing operations inside add(), contains() and remove() methods 
 *     hashCode(), == operator and equals() methods are called and those methods are executed 
 *     from our adding, searching and removing object's class (i.e; String/Integer/Double/Student/...)
 *     
 * 12. LinkedHashSet class constructors
 * 		1. LinkedHashSet()    
 * 		2. LinkedHashSet(Collection c)    
 * 		3. LinkedHashSet(int intialCapacity)    
 * 		4. LinkedHashSet(int intialCapacity, float loadFactor)    
 */
public class LinkedHashset 
{
   public static void main(String [] args)
   {
	   LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
	   System.out.println(lhs.size());
	   //System.out.println(lhs.capacity());
	   System.out.println();
	   System.out.println(lhs.add("a"));
	   System.out.println(lhs);
	   System.out.println(lhs.add("b"));
	   System.out.println(lhs);
	   System.out.println(lhs.add(97));
	   System.out.println(lhs);
	   System.out.println(lhs.add(98));
	   System.out.println(lhs);
	   System.out.println(lhs.add(true));
	   System.out.println(lhs);
	   System.out.println(lhs.add(6.7));
	   System.out.println(lhs);
	   System.out.println(lhs.add('p'));
	   System.out.println(lhs);
	   System.out.println(lhs.add(null));
	   System.out.println(lhs);
	   System.out.println(lhs.add(0));
	   System.out.println(lhs);
	   System.out.println(lhs.add(99));
	   System.out.println(lhs);
	   System.out.println(lhs.add('c'));
	   System.out.println(lhs);
	   lhs.remove(97);
	   System.out.println(lhs);
	   System.out.println(lhs.size());
	   System.out.println(lhs.size());
	   lhs.removeFirst();
	   System.out.println(lhs);
	   lhs.removeLast();
	   System.out.println(lhs);
	   System.out.println(lhs.remove(99));
	   System.out.println(lhs);
	   System.out.println(lhs.contains(0));
	   System.out.println(lhs.isEmpty());
	   
	   
   }
		 
		  
}
