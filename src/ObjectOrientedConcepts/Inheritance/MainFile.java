package ObjectOrientedConcepts.Inheritance;

public class MainFile {
	
	public static void main(String[] args) {
		MammalSubclassOne mammal = new MammalSubclassOne();
		DogSubclassTwo dog = new DogSubclassTwo();
		AnimalParent animal = new AnimalParent();
		MammalSubclassImplements mammal_imp = new MammalSubclassImplements();
		
		System.out.println("mammal instanceof MammalSubclassOne : "+ (mammal instanceof MammalSubclassOne));
		System.out.println("mammal instanceof AnimalParent : "+(mammal instanceof AnimalParent));
		System.out.println("dog instanceof MammalSubclassOne : "+ (dog instanceof MammalSubclassOne));
		System.out.println("dog instanceof AnimalParent : "+(dog instanceof AnimalParent));
		
		System.out.println("Checking instanceof for interface");
		
		System.out.println("mammal_imp instanceof AnimalParentInterface : "+(mammal_imp instanceof AnimalParentInterface));
		
	}
}
