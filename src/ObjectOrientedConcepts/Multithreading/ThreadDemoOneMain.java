package ObjectOrientedConcepts.Multithreading;

public class ThreadDemoOneMain {
public static void main(String[] args) {
	ThreadDemoOne thread1 = new ThreadDemoOne("Thread - 1");
	thread1.start();
	
	ThreadDemoOne thread2 = new ThreadDemoOne("Thread - 2");
	thread2.start();
}
}
