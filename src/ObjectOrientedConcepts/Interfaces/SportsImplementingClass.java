package ObjectOrientedConcepts.Interfaces;

public class SportsImplementingClass implements ChildInterfaceOneHockey{

	@Override
	public void setHomeTeam() {
		// TODO Auto-generated method stub
		System.out.println("Home team set for hockey");
	}

	@Override
	public void setVisitingTeam() {
		// TODO Auto-generated method stub
		System.out.println("Visiting team set for hockey");
	}

	@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub
		System.out.println("Goal scored");
	}

	@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub
		System.out.println("This is end of period "+ period);
	}

	@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub
		System.out.println("Visiting team just scored goal");
	}

	public static void main(String[] args) {
		SportsImplementingClass obj = new SportsImplementingClass();
		obj.endOfPeriod(99);
		obj.homeGoalScored();
		obj.visitingGoalScored();
		obj.setHomeTeam();
		obj.setVisitingTeam();
	}
}
