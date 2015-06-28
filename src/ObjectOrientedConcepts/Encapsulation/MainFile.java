package ObjectOrientedConcepts.Encapsulation;


public class MainFile {
	public static void main(String[] args) {
	EncapTest encap = new EncapTest();
	
	encap.setName("harshul");
	encap.setAge(24);
	encap.setIdNum("gandhi");
	
	System.out.println("Name : "+encap.getName()+" Age : "+encap.getAge()+" Id: "+encap.getIdNum());
	}
}
