package Multithreading;

public class Thread2 extends Thread
{
    private Addition a; 
    
    public Thread2(Addition a)
    {
    	this.a=a;
    }
    
    @Override
    public void run() 
    {
    	
    	a.add(70,80);
    	    
    }
    public static void main(String [] args)
    {
    	Addition a=new Addition();
    	Thread1 th1=new Thread1(a);
    	Thread2 th2=new Thread2(a);	
    	th1.start();
    	th2.start();
    	
    	
    	
    }
}
