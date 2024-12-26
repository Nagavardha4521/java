package Multithreading;
public class Thread8  extends Thread

{
	private Thread7 thread7;

	public void setThread7(Thread7 thread7) {
		this.thread7 = thread7;
	}
	@Override
	public void run() {
		System.out.println("thread8 run start");

		System.out.println("thread8 is paused for thread7 to complete");
		
		try {
			thread7.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("thread8 is resumed");
		
		System.out.println("thread8 run end");
	}
}

