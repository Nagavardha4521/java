package collections;

import java.util.LinkedList;

public class Linkedlist 
{
    public static void main(String [] args)
    {
    	LinkedList<Object> ll=new LinkedList<Object>();
        System.out.println(ll.size());
        System.out.println(ll);
        System.out.println();
        
        ll.add("a");
        ll.add("b");
        ll.add(5);
        ll.add(null);
        ll.add(5);
        ll.add(true);
        ll.add('a');
        ll.add(null);
        
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println();
        
        ll.add(6.7);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(6,null);
        System.out.println(ll);
        
        System.out.println(ll.get(0));
        System.out.println(ll.get(4));
        System.out.println(ll.get(5));
        System.out.println(ll.get(9));
        for(int i=0;i<ll.size();i++)
        {
        	System.out.print(ll.get(i)+" ");
   
        }
        System.out.println(ll.contains("null"));
    	System.out.println(ll.contains(6.7));
    	System.out.println(ll.contains('A'));
    	System.out.println(ll.remove(5));
    	System.out.println(ll);
    }
}
