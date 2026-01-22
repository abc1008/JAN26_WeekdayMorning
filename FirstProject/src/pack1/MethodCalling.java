package pack1;

public class MethodCalling
{
	public void m1()
	{
		System.out.println("m1 method");
//		m2();
	}

	public void m3()
	{
		System.out.println("m3 method");

//		Object Creation : not needed 
		m1();
		
		
	}

	public static void m2()
	{
		System.out.println("m2 method");

		MethodCalling ref = new MethodCalling();
		ref.m1();
	}

	public static void m4()
	{
		System.out.println("m4 method");

		m2();
		
	}

	public static void main(
			String[] args
	)
	{
		m4();

		MethodCalling ref = new MethodCalling(); // object
		ref.m3();

	}

}
