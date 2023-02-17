package basic;

public class LObject {
	
	//static variable/method :we can call it by class name 
	//non static var/meth:we need to creat an object to call it 
	//className object name =new constructorofthe ();class
	
	int var3=34;
	int var4=45;
	int add=var3+var4;
	
	
	
	public static void main(String args[]) {
		
		LObject obj22=new LObject();//object 
		
		System.out.println(obj22.var3);
		System.out.println(obj22.var4);
		
		System.out.println("the total is"+" "+obj22.add);
		
		
		
	
		
		
	}
		
	
	
	
	
	

}
