/*
 * This class extends Employee abstract class
 * s
 * 
 * */

package ObjectOrientedConcepts.Abstraction;

public class AbstractExtSalary extends AbstractEmployee{
	
	private double salary;
	public AbstractExtSalary(String name, String address, int number,double salary){
		super(name,address,number);
		setSalary(salary);
	}
	
	public void mailCheck(){
		System.out.println("Within mailCheck of Salary class ");
	    System.out.println("Mailing check to " + getName()
	       + " with salary " + salary);
	}
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary >= 0.0){
			salary = newSalary;
		}
	}

	
	/*
	 * This is the definition of abstract method defined in
	 * Employee class.
	 * */
	@Override
	public double computePay(){
		System.out.println("Computing salary pay for : "+getName());
		return salary/52;
	}
}
