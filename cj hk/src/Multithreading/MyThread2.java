package Multithreading;

public class MyThread2  extends Thread
{
	@Override
	public void run()
	{
		for(int i=20;i>=1;i--)
		{
			System.out.println("run i:"+i);
		}
	}
	public static void main(String [] args)
	{
		MyThread2 aobj=new MyThread2();
		aobj.start();
		for(int i=1;i<=20;i++)
		{
			System.out.println("main i:"+i);
		}
	}

}
