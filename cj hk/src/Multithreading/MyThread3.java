package Multithreading;

public class MyThread3 extends Thread
{
	
	public void run()
	{
		String name=this.getName();
		System.out.println(name+"run start");
		for(int i=1;i<=20;i++)
		{
			System.out.println(name+"run end:"+i);
		}
		System.out.println(name+"run end");
	}
    public static void main(String [] args)
    {
    	System.out.println("main start");
    	 
    	MyThread3 aobj=new MyThread3();
        aobj.start();
        
        MyThread3 aobj1=new MyThread3();
        aobj1.start();
         
        MyThread3 aobj3=new MyThread3();
        aobj3.start();
        
        System.out.println("main end");
        
        
    }
}
