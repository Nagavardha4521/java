package Multithreading;

public class DeadLock_join 
{
	public static void main(String []args) throws InterruptedException
	{
	Thread7 thread7 = new Thread7();
	Thread8 thread8 = new Thread8();
	
	thread7.setThread8(thread8);
	thread8.setThread7(thread7);
	
	thread7.start();
	thread8.start();
		
		//System.out.println("main started");
		
//		Thread t=Thread.currentThread();
//		String name=t.getName();
//		System.out.println(name);
		
		System.out.println(Thread.currentThread().getName());
     	Thread.currentThread().join();
//		
//		System.out.println("main method");
	}
	
}
