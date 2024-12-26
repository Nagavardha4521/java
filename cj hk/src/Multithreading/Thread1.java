package Multithreading;

public class Thread1  extends Thread
{
  private Addition a;
  
  public Thread1(Addition a)
  {
	  this.a=a;
  }
  @Override
  public void run()
  {
	  a.add(50,60);
	  
  }
  
}
