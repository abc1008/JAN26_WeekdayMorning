package ineritance;

public class Child_2 extends Parent_2
{
//	super.variableName;
//	super(args);
	
	public Child_2()
	{
		super(5);  // calling constructor of parent class
		System.out.println("Child_2 - Constructor");
	}
	
	
	public Child_2(int number)
	{
		System.out.println("1 arg - Child_2 - Constructor");
	}
	
	public void m1()
	{
		int num = 50;
		
		System.out.println(num);
		
		System.out.println(super.num);
	}

	public static void main(String[] args)
	{
		
		Child_2 c2 = new Child_2(6);
		System.out.println(c2.num);
		
		System.out.println(num2);
		
		System.out.println("************ ");
		c2.m1();
		
		
		
		
	}
}
