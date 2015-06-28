package ObjectOrientedConcepts.Encapsulation;
/*
Encapsulation (aka data hiding): text book definition says : "Encapsulation is 
the technique of making the fields in a class private and 
providing access to the fields via public methods.
What this basically means is making the class members (variable) 
private and writing 'get' methods of them to be accessible
outside class, ofcourse get methods will be public.
Benefits: 
Encapsulation gives maintainability, flexibility and extensibility to our code
 * */
public class EncapTest {
	private String name;
	private String idNum;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public String getIdNum(){
		return idNum;
	}
	 
	public int getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setIdNum(String idNum){
		this.idNum = idNum;
	}
	
	public void setAge(int age){
		this.age=  age;
	}
}
