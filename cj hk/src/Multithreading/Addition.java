package Multithreading;

public class Addition
{
     private int x;   //0
     private int y;
     
     synchronized void add(int x,int y)    //  thread 2 70 80 
     {
    	 this.x=x;
    	 this.y=y;
    	 try
    	 {
    		
    		 Thread.sleep(100);  //thread2
    		
    		 int result=this.x+this.y;    //thread1 70+80=150   70+80=150
    		 System.out.println(result);
    		 
    	 }
    	 catch(InterruptedException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
    	 
     }
     
     
     
	}
     
     

