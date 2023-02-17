package basic;

import basic.PracticNestedClass.compture.Mobile;

public class PracticNestedClass {
	
	int num=20;
	int num1=30;
	
	
             public static void main(String[] args) {
            	 PracticNestedClass learn=new PracticNestedClass();
            	 System.out.println(learn.num);
            	 
            	 compture com=new   compture();
            	 System.out.println(com.compturName);
            	 System.out.println(compture.compturPrice);
            	 
            	 compture.computerDisplay();
            	 
            	 
            	 Mobile mobile=new Mobile();
            	 System.out.println(mobile.mobilePrice);
            	 System.out.println(Mobile.mobilebrand);
            	 
            	 
            	
		
		
             }
	
	
	public static  class compture{
		String compturName="HP";
		static String compturPrice="2000";
		
		public static void computerDisplay() {
			System.out.println("hello");
		
			
		}
		
		
	public static class Mobile{
		static String mobilebrand ="Iphone";
		int mobilePrice=1200;
		
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
