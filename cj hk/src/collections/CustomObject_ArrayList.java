package collections;

import java.util.ArrayList;

public class CustomObject_ArrayList 
{
     public static void main(String [] args) throws InstantiationException, IllegalAccessException
     {
    	 ArrayList<Student> al=new ArrayList<>();
    	 al.add(new Student(101,"s1","c1",1000));
    	 al.add(new Student(101,"s2","c2",2000));
    	 al.add(new Student(101,"s3","c3",25000));
    	 Student s=new Student(102, "S4", "C1", 10000);
    	 al.add(s);
    	 al.add(new Student(104, "S4", "C1", 20000));
    	 al.add(new Student(104, "S4", "C1", 20000));
 		 al.add(new Student(102, "S6", "C3", 25000));
 		 al.add(new Student(102, "S6", "C3", 25000));

    	 System.out.println(al);
    	 System.out.println(al.contains(102));
    	 System.out.println(al.remove(new Student(104,"s4","c1",10000)));
    	 
    	 
//    	// System.out.println
//    	 String sr="str";
//    	System.out.println( sr.getClass().getClassLoader());
//    	 
//    	
//    	Student s12=new Student(0, sr, sr, 0);  //Class
//    	Class c=s12.getClass();
//    	
//    	System.out.println(c);
//    	Student s34=(Student)c.newInstance();
//    	System.out.println(s34);
    	
     }
}
