/*
This class demonstrate implementation of a class
as a thread by extending 'Thread' class. 
 */

package ObjectOrientedConcepts.Multithreading;

public class ThreadDemoTwo extends Thread{
	private String threadName;
	private Thread t;
	
	ThreadDemoTwo(String threadName){
		this.threadName = threadName;
		System.out.println("Creating Thread "+this.threadName);
	}
	
	@Override
	public void run(){
		System.out.println("Running Thread "+this.threadName);
		try {
		for (int i = 0;i<4;i++){
			System.out.println("Thread "+i+" "+this.threadName);
			Thread.sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Killing thread "+this.threadName);
	}
	
	public void start(){
		System.out.println("Starting thread "+this.threadName);
		if(t == null){
			t = new Thread(this, this.threadName);
			t.start();
		}
	}
}
