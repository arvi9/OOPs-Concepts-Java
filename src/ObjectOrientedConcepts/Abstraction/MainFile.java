package ObjectOrientedConcepts.Abstraction;

public class MainFile {
public static void main(String[] args)  {
	
		
		/* This instantiation throws error as
		 * abstract class cannot be instantiated*/
//		AbstractEmployee empObj = new AbstractEmployee("John","Boulevard",90082);
		
	AbstractExtSalary salary = new AbstractExtSalary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	AbstractEmployee emp = new AbstractExtSalary("John Adams", "Boston, MA", 2, 2400.00);
	
	System.out.println("Calling mail check using Salary reference");
	salary.mailCheck();
	System.out.println("\nCalling mail check using employee reference");
	emp.mailCheck();
	}
}
