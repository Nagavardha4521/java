package java_8_features;


interface Example1
{
	static void m1()
	{
		hiWish();
		System.out.println("sm m1");		
	}
	static void m2()
	{
		hiWish();
		System.out.println("sm m2");
	}
	static void m3()
	{
		hiWish();
		System.out.println("sm m3");
	}
	default void m4()
	{
		helloWish();
		System.out.println("dm m4");
	}
	default void  m5()
	{
		helloWish();
		System.out.println("dm m5");
	}
	default void m6()
	{
		helloWish();
		System.out.println("dm m6");
	}
	private static void hiWish()
	{
		System.out.println("hi");
	}
	private static void helloWish()
	{
		System.out.println("hello");
	}	
}
class Sample implements Example1
{
	
}
public class Static_implemented_method 
{
   public static void main(String [] args)
   {
	   Example1 e1=new Sample();
	   Example1.m1();
	   Example1.m2();
	   Example1.m3();
	   e1.m4();
	   e1.m5();
	   e1.m6();
	   
   }

}

	
