/*
 * In very simple terms, overriding is "when child class
 * defines a method from parent in its own way".
 * Here we are NOT talking about abstract class, where
 * method is only declared in parent and defined in child.
 * In this case, method has a definition in parent as well but
 * child gives it its own shape.
 * */

/*
 * 
1. The argument list should be exactly the same as that of the overridden method.
2. The return type should be the same or a subtype of the return type declared in
 the original overridden method in the superclass.
3. The access level cannot be more restrictive than the overridden method's access level.
For example: if the superclass method is declared public then the overridding method 
in the sub class cannot be either private or protected.*/
package ObjectOrientedConcepts.Overriding;

public class ParentOne {
	public void move(){
		System.out.println("Parent class : Parent can move");
	}
}
