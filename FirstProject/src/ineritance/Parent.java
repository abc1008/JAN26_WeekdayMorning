package ineritance;

public class Parent
{
	int num = 20;
	static int num2 = 50;
	
	
	public Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	public void m1()
	{
		System.out.println("m1 of Class_1");
	}
	
	public static void m2()
	{
		System.out.println("m2 of Class_1");
	}
	
	public static void main(String[] args)
	{
		Parent p1 = new Parent();
//		p1.m3();
	}

}
