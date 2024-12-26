package java_8_features;
class Addition
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Subtraction
{
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
class Multiplication
{
	void mul(int a,int b)
	{
		int c=a*b;
	}
}
class Division
{
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}

class Calc
{
	static void calculate(Addition a)
	{
		a.add(50,60);
	}
	static void calculate(Subtraction s)
	{
		s.sub(50,60);
	}
	static void calculate(Multiplication m)
	{
		m.mul(50,60);
	}
	public static void main(String []args)
	{
		
	 
	}
}
interface AO
{
	void ao(int a,int b);
	static int staicmethod() {
		
		return 0;
	}
	default String stringmethod() {
		return "this is string method";
	}
}

public class Functional_programming 
{
	public static void main(String [] args)
	{
		
		
		AO a11=(int a, int b)->System.out.println(a+b);
			a11.ao(12, 12);
			a11.stringmethod();
//			a11.staicmethod();
			
	
		
		a11.ao(56, 78);
		
		//lambda expression
		AO a2=(int a,int b)->{System.out.println("add le1:"+(a+b));};
		AO a3=(int a,int b)->System.out.println("sub le1:"+(a-b));
		AO a4=(int a,int b)->System.out.println("mul le1:"+(a*b));
	     a2.ao(10,20);	
	     a3.ao(10,20);	
	     a4.ao(10,20);	
	     
		
		
      Addition a1=new Addition();
      Subtraction s1=new Subtraction();
      Multiplication m1=new Multiplication();
      Division d1=new Division();
      a1.add(10,20);
      s1.sub(10,20);
      m1.mul(10,20);
      d1.div(10,20);
	}
}
