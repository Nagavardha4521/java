package com.pack1;

import java.util.Arrays;

public class Object_class_getClass
{
	
     public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
     {
    	
    	 ClassA aobj=new ClassA(10,20);
    	 Class cls=aobj.getClass();
    	 
    	//ClassA obj= (ClassA) cls.newInstance();
    	 System.out.println(cls);
    //	 System.out.println(obj);
    	 System.out.println(cls.getSuperclass());
    	 System.out.println(Arrays.toString(cls.getInterfaces()));
    	 System.out.println(Arrays.toString(cls.getAnnotations()));
    	 System.out.println(Arrays.toString(cls.getFields()));
    	 System.out.println(Arrays.toString(cls.getDeclaredFields()));
    	 System.out.println(Arrays.toString(cls.getConstructors()));
    	 System.out.println(Arrays.toString(cls.getDeclaredConstructors()));
    	 System.out.println(Arrays.toString(cls.getMethods()));
    	 System.out.println(cls.getMethods().length);
    	 System.out.println(Arrays.toString(cls.getDeclaredMethods()));
    	 System.out.println((cls.getDeclaredMethods().length));
    	 
    	 System.out.println();
    	 Class cls1=ClassA.class;
     }
}
