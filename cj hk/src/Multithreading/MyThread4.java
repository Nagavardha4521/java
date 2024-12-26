package Multithreading;

public class MyThread4 extends Thread
{
	@Override
	public void run()
	{
	   System.out.println("run start");
	   
	   System.out.println("run state #3:"+this.getState());
	   
	   try
	   {
		   Thread.sleep(5000);
		} 
	   catch(InterruptedException e)
	   {
		   System.out.println("run end");
	   }
	}
	


	public static void main(String [] args) throws InterruptedException
	{
		System.out.println("main start");
		
		MyThread mt1=new MyThread();
		System.out.println("main state #1:"+mt1.getState());
		
	    mt1.start();
		System.out.println("main state #2:"+mt1.getState());
		
	    Thread.sleep(2000);
		System.out.println("main state #4:"+mt1.getState());
		
		Thread.sleep(7000);
		System.out.println("main state #5:"+mt1.getState());
		
		System.out.println("main end");
	}
}

