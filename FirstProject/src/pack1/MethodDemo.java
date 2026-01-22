package pack1;

public class MethodDemo 
{
	

//	SYNTAX: Non-Static method
	
//	public void methodName()
//	{
		// method body
//	}
	
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	
//	SYNTAX: Static method
	
//	public static void methodName()
//	{
		// method body
//	}
	
	
	public static void m2()
	{
		System.out.println("m2 method");
	}
	
	
	public static void main(String[] args) 
	{
		
//		call method m1
		
//		SYNTAX: calling non-static
		
//		Create an object and using ref variable of object, we can call non-static method
		
		MethodDemo ref = new MethodDemo();  // object
		ref.m1();
		
		System.out.println("after m1 call");
		
		
//		SYNTAX: calling static method
		
//		methodName();
		
		m2(); 
		
		System.out.println("after m2 call");
		
		ref.m2();  // not recommended 
		
	}

	
	
	

}
