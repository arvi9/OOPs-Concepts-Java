/*
 * ABSTRACT CLASS: 
 * Abstract classes cannot be instantiated.
 * All other functionalities like member, methods and constructors still exist and function in same
 * manner. Only difference between regular class and abstract class is that it cannot be instantiated.
 * So that essentially means that their existence is worth less as we cannot create any object.
 * There is one way in which these can be used, by inheriting them. This is just to help a design where
 * a class needs to be created but never instantiated. 
 * 
 * */
package ObjectOrientedConcepts.Abstraction;

public abstract class AbstractEmployee {
	private String name;
	private String address;
	private int number;
	
	public AbstractEmployee(String name, String address, int number){
		System.out.println("Constructing an employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay(){
		System.out.println("Computing pay");
		return 0.0;
	}
	
	public void mailCheck(){
		System.out.println("Mailing check to "+this.name+" at "+this.address);
	}
	
	public String toString(){
		return name+" "+address+" "+number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String newAddress){
		address = newAddress;
	}
	
	public int getNumber(){
		return number;
	}
}
