package ineritance;

public class Child extends Parent
{
	public Child(int num)
	{
		System.out.println("1 arg - Child Constructor");
	}
	
	
	
	public void m3()
	{
		System.out.println("m3 of child");
	}
	
	
	public static void main(String[] args)
	{
		
		Parent c1 = new Parent();
		c1.m1();
		
		
//		Child c2 = new Child();
//		c2.m1();
		
		
		Child.m2();
		System.out.println(num2);
		
		
	}
}
