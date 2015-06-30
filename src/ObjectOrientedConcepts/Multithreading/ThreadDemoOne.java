/*
 * 
 Multithreading:
 We can divide specific operation in a single application
 into multiple thread. 
 Lifecycle:
 1. New : Initial state. Not started yet.
 2. Runnable : Started state. Executing the task.
 3. Waiting : Hung State. Thread waits for another thread to finish task
 4. Timed Waiting : Waiting for a specific time. Goes back to runnable state once time's up.
 5. Terminated : Runnable thread enters terminated state once its finished with its task
 
 Two ways to create threads:
 1. Implement RUNNABLE INTERFACE
 2. Extending THREAD CLASS
 */

/*
 This demo contains demonstration of a thread via 
 runnable interface
 
 */
package ObjectOrientedConcepts.Multithreading;

public class ThreadDemoOne implements Runnable{

	private Thread t;
	private String threadName;
	
	ThreadDemoOne(String threadName){
		this.threadName = threadName;
		System.out.println("Creating "+this.threadName);
	}
	
	
	@Override
	public void run() {
		System.out.println("Running "+threadName);
		try{
			for (int i = 4 ;i > 0;i--){
				System.out.println("Thread "+threadName+", "+i);
				Thread.sleep(50);
			}
		}catch (InterruptedException e){
			System.out.println("Thread "+threadName+" interrupted");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	
	public void start(){
		System.out.println("Starting "+threadName);
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
		
	}
}
