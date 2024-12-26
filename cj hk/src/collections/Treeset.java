package collections;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * 1. The TreeSet is a collections framework collection, it is available from Java 1.2 version
 *    It is an implementation of NavigableSet which is a sub interface of SortedSet
 *    
 * 2. TreeSet is used when we want to store objects in sorting order
 *    The sorting order can be either ascending order or descending order 
 *    
 *    The TreeSet doesn't have any default sorting order. 
 *    
 *    For sorting objects TreeSet internally uses  
 *    		1. Comparable interface compareTo(-) method or 
 *       	2. Comparator interface compare(-,-) method 
 *    
 *    For supplying 'default sorting order' along with adding object 
 *    we must use 'Comparable' interface
 *    
 *    For supplying 'custom sorting order' separately by other programmer 
 *    we must use 'Comparator' interface 
 *     
 *    The TreeSet doesn't have any default sorting order. 
 *    It is sort objects based on the default sorting order provided by the 
 *    adding object class with the Comparable interface compareTo(-) method internally
 *     
 * 3. It is a non synchronized collection 
 * 
 * 4. It is an ordered collection stores objects in sorting order 
 * 
 * 5. It's implemented data structures 'Red-Black' tree
 * 
 * 6. It's a default capacity is 0 increased by 1
 * 
 * 7. Inside TreeSet we can store only 
 *     Comparable homogeneous objects both unique and duplicates
 *     
 *     Note: If you want to store non comparable objects, 
 *           we must supply custom comparator 
 *           
 * 8. Null is not allowed, single null is also not allowed  
 * 
 * 9. Objects are stored in sorting order 
 * 
 * 10. Objects can be retrieved only in sequential order 
 * 
 * 11. In adding, searching and removing operations TreeSet internally uses 
 *     Comparable.compareTo(-) method or Comparator.compare(-,-) method 
 *      
 * 12. TreeSet class has 4 constructors
 * 		1. TreeSet()          
 * 		2. TreeSet(Collection c)          
 * 		3. TreeSet(SortedSet ss)          
 * 		4. TreeSet(Comparator c)          
 *     
 */

public class Treeset 
{
      public static void main(String[] args)
      {
    	  TreeSet<Integer> ts=new TreeSet<>();
    	  System.out.println(ts.size());
    	  ts.add(97);
    	  ts.add(98);
    	  ts.add(98);
    	  System.out.println(ts);
    	  TreeSet<String> ts1=new TreeSet<>();
    	  ts1.add("naga");
    	  ts1.add("vardhan");
    	  ts1.add("gurram");
    	  ts1.add("ramu");
    	  System.out.println(ts1);
    	  System.out.println();
    	  
    	  TreeSet<String> ts3=new TreeSet<>((s1, s2) -> s2.compareTo(s1));
    	  ts3.add("naga");
    	  ts3.add("gurram");
    	  ts3.add("vardhan");
    	  ts3.add("vardhan");
    	  ts3.add("ramu");
    	  System.out.println(ts3);
    	  System.out.println();
    	  
    	TreeSet<Integer> ts4 = new TreeSet<>((io1, io2) -> io2.compareTo(io1));
    	   ts4.add(5);
    		ts4.add(7);
    		ts4.add(6);
    		System.out.println(ts4);
    	  System.out.println();
    	  TreeSet<Object> ts5 = new TreeSet<>();
  		ts5.add("a");
  		ts5.add("c");
  		//ts5.add(5);
  		//ts5.add(null);
  		
  		
  		
  		
  		
  		
  		
    	
    			  
    	  
    	 
    	 
      }
}

