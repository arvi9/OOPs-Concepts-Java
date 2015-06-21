/*
 * In very simple terms, overriding is "when child class
 * defines a method from parent in its own way".
 * Here we are not talking about abstract class, where
 * method is only declared in parent and defined in child.
 * Here method has a definition in parent as well but
 * child gives it its own shape.
 * */
package ObjectOrientedConcepts.Overriding;

public class ParentOne {
	public void move(){
		System.out.println("Parent class : Parent can move");
	}
}
