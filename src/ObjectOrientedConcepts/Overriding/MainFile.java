package ObjectOrientedConcepts.Overriding;

public class MainFile {
	public static void main(String[] args) {
		ParentOne parent = new ParentOne();
		ParentOne child = new ChildOne();
		
		parent.move();
		child.move();
		
		/*
		 * Following method call generates error as child
		 * object is actually of type Parent and Parent class
		 * doesn't have "slide()" method defined in it*/
//		child.slide();
	}
}
