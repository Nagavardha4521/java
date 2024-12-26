package java_8_features;

interface Example2
{
     default void m2()
     {
           System.out.println("interface DM is executed from interface Example2");
     }
}

interface Example 
{
	abstract void m1();
	default void m2()
	{
		System.out.println("interface DM is executed from interface Eaxmple");
	}
}

class A implements Example,Example2
{
	public void m1()
	{
		System.out.println("interface AM is executed from class A");
	}
	public void m2()
	{
		System.out.println("interface AM is executed from class A");
	}
	
}
class B implements Example
{
	public void m1()
	{
		System.out.println("interface AM is executed form class b");
	}
	
	public void m2()
	{
		System.out.println("  DM is executed from class b");
	}
}
class C  implements Example
{
	public void m1()
	{
		System.out.println("interface AM is executed from class c");
	}
	public void m2()
	{
		System.out.println("interface DM is executed from classc");
		Example.super.m2();
	}
}
interface I1
{
	default void m1()
	{
		System.out.println("DM from I1");
	}
}
interface I2
{
	default void m1()
	{
		System.out.println("DM from I2");
	}
}
class E implements I1,I2
{
	public void m1()
	{
		System.out.println("I1,I2 DM from class E");
	}
}
class F implements I1,I2
{
	public void m1()
	{
		System.out.println("I1,I2 DM from class F");
		I1.super.m1();
		I2.super.m1();
	}
	
	 
}

public class Inteface_enhancements 
{
     public static void main(String [] args)
     {
    	 Example e1;
    	 e1=new A();
    	 e1.m1();
    	 e1.m2();
    	 System.out.println();
    	 e1=new B();
    	 e1.m1();
    	 e1.m2();
    	 System.out.println();
    	//======================= 
    	 E e2=new E();
    	 e2.m1();
    	 
    	 I1 i1=new E();
    	 i1.m1();
    	  
    	 I2 i2=new E();
    	 i2.m1();
    	 System.out.println();
    	 //=======================
    	 F f1=new F();
    	 f1.m1();
    	 
    	
     }
}



