package ObjectOrientedConcepts.Inheritance;

public class Child extends InheritenceObjects{
	public Child(){
//		super();
		System.out.println("CHild");
		
	}
	
		
	public static void main(String[] args) {
		/*
		 * Parent class (InheritenceObjects here) is a generic class
		 * that defines all its children. Now, each child may add its
		 * own methods and attributes on top of parent's. But we always 
		 * instantiate object of parent (the base class, base for all
		 * children) with reference to individual child class.*/
		InheritenceObjects c = new Child();
		/*
		 * Constructor call in above is in the sequence of Parent -> Child.
		 * */
		
		/*
		 * This thows error because InheritenceObjects class (parent) doesn't
		 * know who child is, because child inherits parent, parent doesn't inherit
		 * child. Even if we add cast (Child) in front of "new" keyword, running it
		 * will still throw error.*/
//		Child c = new InheritenceObjects();
	}
}