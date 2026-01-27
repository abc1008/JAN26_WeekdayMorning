package ineritance;

public class Child3 extends Child2
{
	
	public Child3()
	{
		System.out.println("Child3 Constructor");
	}
	
	

	public static void main(String[] args)
	{
		
		Child3 c3 = new Child3();
		
//		Flow of calls : 
//		1. Child3 - default constructor
//		2. Child2 - default constructor
//		3. Child1 - user defined constructor
//		4. Parent - user defined constructor
	}
}
