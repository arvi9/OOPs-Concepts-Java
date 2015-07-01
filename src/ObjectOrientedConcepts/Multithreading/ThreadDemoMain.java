package ObjectOrientedConcepts.Multithreading;

public class ThreadDemoMain {
public static void main(String[] args) {
//	ThreadDemoOne thread11 = new ThreadDemoOne("Thread - 11");
//	thread11.start();
//	
//	ThreadDemoOne thread12 = new ThreadDemoOne("Thread - 12");
//	thread12.start();
	
	ThreadDemoTwo thread21 = new ThreadDemoTwo("Thread - 21");
	thread21.start();
	
	ThreadDemoTwo thread22 = new ThreadDemoTwo("Thread - 22");
	thread22.start();
}
}
