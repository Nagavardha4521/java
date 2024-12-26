package Multithreading;

public class MyThread extends Thread
{
	public void run()
	{
		System.out.println("run executed");
	}
      public static void main(String [] args)
      {
    	  
    	  MyThread aobj=new MyThread();
    	  aobj.start();
    	  
    	  new Thread().run();
    	  System.out.println("main executed");
      }
}
