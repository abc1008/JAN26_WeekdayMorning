package pack1;

public class ConstructorDemo
{
	int num = 20;
	String s1 = "ABC";
	
	int num2;
	String s2;

//	public ClassName()
//	{
//		// constructor body
//	}

	public ConstructorDemo(int a)
	{
		System.out.println("int arg - Constructor is running.");
//		System.out.println("a : " + a);
		
		num2 = a;
	}
	
	public ConstructorDemo()
	{
		System.out.println("0 arg - Constructor");
	}

	public ConstructorDemo(char ch)
	{
		this();  // constructor call for 0 arg constructor
		System.out.println("char arg - Constructor");
	}
	
	public ConstructorDemo(char ch, int num)
	{
		System.out.println("char,int arg - Constructor");
	}
	
	
	public ConstructorDemo(int num, char ch)
	{
		this('y');   // constructor call for char arg constructor
		System.out.println("int, char arg - Constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		ConstructorDemo ref = new ConstructorDemo(5);
		
//		System.out.println(ref.s1);
//		System.out.println(ref.num);
		
//		System.out.println(ref.s2);
		
		
		System.out.println("ref.num2 : " + ref.num2);
		
		
		ConstructorDemo ref2 = new ConstructorDemo(7);
		System.out.println("ref2.num2 : " + ref2.num2);
		
		ConstructorDemo ref3 = new ConstructorDemo(8);
		System.out.println("ref3.num2 : " + ref3.num2);
		
		System.out.println();
		System.out.println("****  Multiple Constructors ****");
		System.out.println();
		
		ConstructorDemo ref4 = new ConstructorDemo('c');
		ConstructorDemo ref5 = new ConstructorDemo('c',7);
		ConstructorDemo ref6 = new ConstructorDemo(7,'c');
		
		
	}

}
