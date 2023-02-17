package basic;

public class AccessModifier {
	
	//access modifier 
	//public 
	//private
	//protected
	//default
	
	public static  int var=500;
	
	private static int salary=5000;
	protected static int var2=6785;
	
	
	static String stName="Eileen Attari";
	
	public static void TvDisplay(){
		int num1=20;
		int num2=10;
		int total=num1+num2;
		System.out.println("the total is "+" "+total);

	}
	
	
	public static void main(String args []) {
		//System.out.println(AccessModifier.var);
		AccessModifier.var=250;//reAssign
		System.out.println(AccessModifier.var);
		System.out.println(AccessModifier.salary);
		AccessModifier.salary=7000;
		System.out.println(AccessModifier.salary);
		
		System.out.println(AccessModifier.var2);
		AccessModifier.stName="jamas attari";
		System.out.println(AccessModifier.stName);
		
		AccessModifier.TvDisplay();
		
			
	}
	

}
