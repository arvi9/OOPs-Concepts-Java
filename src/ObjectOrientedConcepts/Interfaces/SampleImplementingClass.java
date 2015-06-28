package ObjectOrientedConcepts.Interfaces;

public class SampleImplementingClass implements SampleInterface {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat method overriden in implemting class");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Travel method from interface");
	}
	
	public void local(){
		System.out.println("Implementing class has one of its own methods");
	}
	
	public static void main(String[] args) {
		SampleImplementingClass obj = new SampleImplementingClass();
		obj.eat();
		obj.travel();
		obj.local();
	}
}
