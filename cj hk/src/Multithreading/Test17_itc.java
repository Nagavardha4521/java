package Multithreading;

public class Test17_itc 
{
   public static void main(String [] args)
   {
	   Factory factory=new Factory();
	   
	   Producer producer=new Producer(factory);
	   
	   Consumer consumer=new Consumer(factory);
	   
	   Thread th1=new Thread(producer);
	   
	   Thread th2=new Thread(consumer);
	   
	   th1.start();
	   th2.start();
			   
   }
}
