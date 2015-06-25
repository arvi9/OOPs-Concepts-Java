package ObjectOrientedConcepts.Overriding;


public class ChildOne extends ParentOne{
	
	@Override
	public void move(){
		super.move();
		System.out.println("Child class : Child can run and walk");
	}
	
	public void slide(){
		System.out.println("Child class : Child can slide");
	}
}
