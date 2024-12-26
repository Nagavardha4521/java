package Multithreading;

public class Consumer implements Runnable
{
     private Factory factory;
      
     public Consumer(Factory factory)
     {
    	 this.factory=factory;
     }
     @Override
     public void run()
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 factory.consume(i);
    	 }
     }
}
