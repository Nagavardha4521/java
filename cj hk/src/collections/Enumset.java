package collections;

import java.util.EnumSet;

/**
 * 1. The EnumSet<E> is a Collections Framework collection. 
 *    It is available from Java 5v. It is an implementation of Set<E> interface.
 *    
 * 2. When we need to store one particular enum's named constants as one group, 
 *    we must choose EnumSet<E> 
 *    
 * 3. It is not synchronized means not thread safe object.
 * 
 * 4. It is an ordered collection
 *    it stores named constants in the order
 *    exactly they are declared in the enclosing enum
 *    
 * 5. Its implemented data structure is fixed Enum[]
 *    the length of this array is the given enum size, 
 *    means the number of named constants available in this enum
 *    
 * 6. Its default capacity is enum size, 
 *    means the number of named constants available in the given enum
 *    
 * 7. It allows us to store only the given enum's named constants
 *    It does not store duplicate named constants
 *    
 * 8. It does not allow null, throws NPE
 * 
 * 9. It preserves named constants exactly as they were declared in the given enum
 * 
 * 10. It allows us to retrieve elements only sequentially
 * 
 * 11. In adding, searching and removing operations internally equals() method is called
 *     and its executed from enum.
 *     
 * 12 EnumSet<E> class constructors
 *       In EnumSet class we do not have any public constructor
 *       It has only private no param constructor.
 *       
 *       It provides set of factory methods to create its instances
 *       by copying named constants from the given enum.
 *     
 * 13. EnumSet<E> class methods (34 + 12)
		1) public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)
			Creates an empty EnumSet with the specified enum type.
			
		2) public static <E extends Enum<E>> EnumSet<E> allOf​(Class<E> elementType)
		     Creates an EnumSet containing all of the named constants in the specified enum type.
		     
		3) Creates an EnumSet initially containing the specified named constants.	
			public static <E extends Enum<E>> EnumSet<E> of​(E e)
			public static <E extends Enum<E>> EnumSet<E> of​(E e1, E e2)
			public static <E extends Enum<E>> EnumSet<E> of​(E e1, E e2, E e3)
			public static <E extends Enum<E>> EnumSet<E> of​(E e1, E e2, E e3, e4)
			public static <E extends Enum<E>> EnumSet<E> of​(E e1, E e2, E e3, e4, e5)
			public static <E extends Enum<E>> EnumSet<E> of​(E first, E... rest )
		
		4) Creates an EnumSet initially containing all of the elements 
		   in the range defined by the two specified end points. 
			public static <E extends Enum<E>> EnumSet<E> range​(E from, E to)
		
		
		5) Creates an EnumSet by copying named constants from given EnumSet or Collection
			public static <E extends Enum<E>> EnumSet<E> copyOf​(EnumSet<E> s)
			public static <E extends Enum<E>> EnumSet<E> copyOf​(Collection<E> c)
		
		6) Creates an EnumSet with the named constants 
		   those are not contained in the passed EnumSet.
			public static <E extends Enum<E>> EnumSet<E> complementOf​(EnumSet<E> s)
			
Below code shows creating EnumSet object with above factory methods 
 				
*/
enum FoodItem
{
       IDLY,DOSA,PURI,VADA,PONGAL,CHAPATI,UPMA  
}
public class Enumset
{
	public static void main(String [] args)
	{
		//EnumSet<FoodItem> es1=EnumSet.noneOf(FoodItem.class);
		//EnumSet<FoodItem> es2=EnumSet.of(FoodItem.PONGAL,FoodItem.DOSA,FoodItem.CHAPATI);
//		EnumSet<FoodItem> es3 = EnumSet.copyOf(es2);
//		EnumSet<FoodItem> es4=EnumSet.complementOf(es2);
		EnumSet<FoodItem> es5=EnumSet.allOf(FoodItem.class);
				
	
	//	System.out.println(es1);
//		System.out.println(es2);
//		System.out.println(es3);
//		System.out.println(es4);
		System.out.println(es5);
		
	}
}
