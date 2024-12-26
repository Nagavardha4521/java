package Multithreading;

public class MyRunnable implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("run is exceucted");
	}
		
	
     public static void main(String [] args)
     {
    	 MyRunnable mr=new MyRunnable();
    	 
    	 Thread th=new Thread(mr);
    	 th.start();
    	 System.out.println("main executed");
    	 
     }

	
}
