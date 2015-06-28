/*
Interface:
Interface is like a complete abstract class in java.
It only contains declaration of attributes and methods
i.e. all methods are abstract.
These cannot be extended, these are implemented by classes BUT
an interface can extend another interface

If a class implements an interface, it should implement
all its methods, IF IT DOES NOT, implementing class
should be defined as ABSTRACT
 * 
 * */
package ObjectOrientedConcepts.Interfaces;

public interface SampleInterface {
	public void eat();
	public void travel();
}
