package pack1;

import access_modifiers.TestClass_1;

public class ProtectedTest extends TestClass_1
{
	
	public static void main(String[] args)
	{
		TestClass_1 t1 = new TestClass_1();
//		t1.m1();
		
		
//		System.out.println(t1.num2);
		
		ProtectedTest pt = new ProtectedTest();
		pt.m1();
		
		System.out.println(pt.num2);
	}

}
