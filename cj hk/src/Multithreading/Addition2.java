package Multithreading;

public class Addition2 
{
    private static int x;
    private static int y;
    
    static void add(int x,int y)
    {
    	Addition2.x=x;
    	Addition2.y=y;
    	
    	try
    	{
    		Thread.sleep(2000);
    		
    	}
    	catch(InterruptedException e)
    	{
    		int res=Addition2.x+Addition2.y;
    	}
    	int res=Addition2.x+Addition2.y;
    	System.out.println(Thread.currentThread().getName()+"res: "+res);
    }
}
