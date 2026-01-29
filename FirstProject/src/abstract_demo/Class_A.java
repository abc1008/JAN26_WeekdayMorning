package abstract_demo;

public abstract class Class_A
{
	int num;
	static int num2 = 50;
	
	public Class_A(int num)
	{
		this.num = num;
		System.out.println("Class_A Constructor");
	}
	
	

//	abstract - vague or unclear

	public abstract void m1(); // abstract method or incomplete method

	public abstract void m3(
			int a
	);

	public abstract void m4();

	public void m2() // concrete method or complete method
	{
		System.out.println("m2");
	}

	public static void m7()
	{
		System.out.println("m7 static");
	}

}
