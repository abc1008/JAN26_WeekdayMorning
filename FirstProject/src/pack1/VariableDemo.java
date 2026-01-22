package pack1;

public class VariableDemo {
	
//	SYNTAX: Static Variable
	
//	static DataType variableName = value;
	static int num;
	static String s1;
	static boolean result;
	
	
	
//	SYNTAX: Non-Static Variable
	
//	DataType variableName = value;
	
	int num2 = 20;
	String s2;
	
	
	
	public void m1()
	{
		System.out.println(num);
		System.out.println(s1);
		
		
		System.out.println("num2 from m1 method : " + num2);
		
		
	}
	
	public static void m2()
	{
		System.out.println(num);
		
		VariableDemo vd = new VariableDemo();
		System.out.println("num2 from m2 method : " + vd.num2);
		
	}
	
	
	public void m3()
	{
//		Syntax Local Variable: 
//		DataType variableName = value;
		
		int number = 200;
		System.out.println("Local Var : " + number);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
//		System.out.println(number);
		
//		Syntax for calling static variable within current class: variableName;

		System.out.println(num);
		
		
		VariableDemo ref2 = new VariableDemo();
		ref2.m1();
		
		m2();
		
		System.out.println(ref2.s2);
		
		
		ref2.m3();
	}

}
