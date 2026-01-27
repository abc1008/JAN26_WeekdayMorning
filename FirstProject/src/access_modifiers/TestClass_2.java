package access_modifiers;


public class TestClass_2
{
	
	public static void main(String[] args)
	{
		TestClass_1 t1 = new TestClass_1();
		t1.m1();
		
		System.out.println(TestClass_1.num);
		
		System.out.println(t1.num2);
	}

}
