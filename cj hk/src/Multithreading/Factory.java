package Multithreading;

public class Factory 
{
     private int items;
     private boolean itemsAvailable;
    synchronized void produce(int items)    //1 - 10
     {
    	 if(itemsAvailable)
    	 {
    		 try
    		 {
    			 wait();
    			 System.out.println("factory produce if block ");
    		 }
    		 catch(InterruptedException e)
    		 {
    			 e.printStackTrace();
    			 
    		 }
    	 }
    	 this.items=this.items+items;     //0+1
    	 System.out.println("items produced: "+items);
    	 itemsAvailable=true;
    	notify();
    	 
     }
   synchronized void consume(int intems)
     {
    	 if(!itemsAvailable)
    	 {
    		 try
    		 {
    			 wait();
    			 System.out.println("factory consume if block");
    		 }
    		 catch(InterruptedException e)
    		 {
    			 e.printStackTrace();
    		 }
    	 }
    	 this.items=this.items-items;   //1-1=0
    	 System.out.println("items cosumed: "+items);
    	 itemsAvailable=false;
    	 notify();
     }
}
