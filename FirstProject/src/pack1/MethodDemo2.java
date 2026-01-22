package pack1;

public class MethodDemo2 
{
//	Variable
//	Methods
//	Call Them - Main
	
	public static void main(String[] args) 
	{
		
//		Non-Static Method - same as within current 
		
		MethodDemo ref = new MethodDemo();  // object of class in which method is present
		ref.m1();
		
		
//		Static method from another class. 
//		SYNTAX:  ClassName.methodName();
		
		MethodDemo.m2();
		
		

		
	}
	
	
	

}
