package construtor;

public class PracticeBurger {
	
	String nameOfBurger;
	char size;
	String topping;
	double priceOfBurger;
	int quantityOfBurger;
	double totalValue;
	boolean isBurgerAvailable;
	
	
	
	
      public static void main(String[] args) {
    	 
    	PracticeBurger myBurger= new PracticeBurger();
    	
//		PracticeBurger yourBurger=new PracticeBurger("Domains");
//    	System.out.println(yourBurger.nameOfBurger);
//		

		 PracticeBurger hisBurger=new PracticeBurger("Domains",'L');
		 System.out.println(hisBurger.size);
		 
		 PracticeBurger herBurger=new PracticeBurger("Domains","machromas",'L');
		 System.out.println(hisBurger.size);
		 


		 
		 
		
		
		
		
	       }

	//default constructor:
	public PracticeBurger() {	
	}
	
	//single parameterized
	public PracticeBurger(String nameOfBurger) {	
		this.nameOfBurger=nameOfBurger;
		System.out.println("Burger name is "+this.nameOfBurger);//this.nameofburger is from global variable
		//System.out.println("Burger name is "+nameOfBurger);//nameOfBurger is the locale variable
	    }
	
	//double parametrized:
	public PracticeBurger(String nameOfBurger, char size) {	
		 char burgersize=this.size=size;
		System.out.println("the burger name is "+nameOfBurger+" the size of the burger is "+burgersize);
	    }
	
	
	public PracticeBurger(String nameOfBurger , String topping , char size) {	
		System.out.println("the burger name is " + nameOfBurger + " topping is " + topping + " the size of the burger is "+size);
	    }
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
