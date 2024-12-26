package collections;

import java.util.Vector;

public class VectorClass
{    
	void meth1()
	{
		Vector<Object> v=new Vector<>();
		v.add("naga");
		v.add(10);
		v.add(null);
		v.add(false);
		v.add('x');
	    System.out.println("size:"+v.size());
	    System.out.println("capacity:"+v.capacity());
		v.add(2,"naga");
		v.add(v.size()-1,1000);
		v.add(v.size(),"naga");
		 System.out.println("size:"+v.size());
		    System.out.println("capacity:"+v.capacity());
		    v.add(2,"naga");
			v.add(v.size()-1,1000);
			v.add(v.size(),"naga");
			System.out.println("size:"+v.size());
		    System.out.println("capacity:"+v.capacity());
		   System.out.println(v);
		    System.out.println();
		    for(int i=0;i<v.size();i++)
		    {
		    	System.out.print(v.get(i)+" ");
		    }
		
	}
	public static void main(String [] args)
	{
		
		
//		VectorClass v=new VectorClass();
//		v.meth1();
		Vector<Object>v1=new Vector<>();
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();
		
		v1.add("a");
		v1.add("b");
		v1.add(5);
		v1.add(6.7);
		v1.add('a');
		v1.add(true);
		v1.add(null);
		v1.add("a");
		v1.add(null);
		v1.add(5);
	   
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println();
		
		v1.add(6.7);
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println();
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(4));
		System.out.println(v1.get(5));
		System.out.println(v1.get(10));
		System.out.println();
		
		for(int i=0;i<v1.size();i++)
		{
			System.out.print(v1.get(i)+" ");
		}
		System.out.println();
	    System.out.println(v1.contains("a")); 
	    System.out.println(v1.contains(6.7));
	    System.out.println(v1.contains("A"));
	    System.out.println(v1.contains(null));
		
		
	}

}
