/*
 * Inheritence: process where one object aquires properties of an other object
 * Two ways to implement inheritence:
 * 1. Extends key word: Defines IS-A relationship. Class Mammal will extend this class.
 * 2. Implements key word: Defines IS-A relationship. Implements (defines) interfaces.
 * Only interfaces can be implemented not classes. Interfaces have no definition of their 
 * own. Interface can be seen as a ALL ABSTRACT CLASS
 * 
 * READ MORE ON TUTORIALPOINT FOR HAS-A RELATIONSHIP
 * */


package ObjectOrientedConcepts.Inheritance;

public class AnimalParent {
	private String desc = "Top most class";
	public String getDescription(){
		return desc;
	}
}
