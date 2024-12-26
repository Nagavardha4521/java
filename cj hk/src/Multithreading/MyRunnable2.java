package Multithreading;

public class MyRunnable2 implements Runnable
{
     public static void main(String [] args)
     {
    	 MyRunnable2 mr=new MyRunnable2();
    	 Thread th=new Thread(mr); 
    	 th.start();
    	 for(int i=1;i<=20;i++)
    	 {
    		 System.out.println("main i:"+i);
    	 }
     }

	@Override
	public void run() 
	{
		
		for(int i=20;i>=1;i--)
		{
			System.out.println("run i:"+i);
		}
	}
}
