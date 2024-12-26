package Multithreading;

public class Producer implements Runnable
{
   private Factory factory;  //null
   
   public Producer(Factory factory)     
   {
	   this.factory=factory;
	   
   }
   @Override
   public void run()
   {
	   for(int i=1;i<=10;i++)
	   {
		   factory.produce(i);
	   }
   }
  
   
  
}
