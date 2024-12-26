package Multithreading;

public class Thread7  extends Thread
{
   private Thread8 thread8;
   
   public void setThread8(Thread8 thread8)
   {
	   this.thread8=thread8;
   }
   public void run()
   {
	   System.out.println("thread7 run start");
	   System.out.println("thread7 is paused for thread8 to complete");
	   try
	   {
		   thread8.join(2000);  //t8 ececution complete then go down
		   
		   
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   System.out.println("thread7 execution is resumed"); 
	   System.out.println("thread7 run end");
	   
   }
} 
