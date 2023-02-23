package construtor;

public class PracticeConstructor {
	
	//AccessModifier className(){}....syntax of the constructor
	//constructor should be outside of the class
	 
	int age =35;
	public PracticeConstructor() {
		//this is a default  constructor 
		System.out.println("this is a default constructor");
	}
	
	public PracticeConstructor(String name) {
		System.out.println(name);
		this.age=35;
		
		
	}
	
	
	
	public static void main(String[] args) {
		//constructor should be a class name
		
		//object:
		PracticeConstructor obj=new PracticeConstructor("ghania");
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
