package access_modifiers;

public class TestClass_1
{
	public static int num = 40;
	public int num2 = 50;
	
	public TestClass_1()
	{
		System.out.println("TestClass_1 - constructor");
	}
	
	
	protected void m1()
	{
		System.out.println("TestClass_1 - m1");
	}
	
	public static void main(
			String[] args
	)
	{
		System.out.println(num);
	}

}
