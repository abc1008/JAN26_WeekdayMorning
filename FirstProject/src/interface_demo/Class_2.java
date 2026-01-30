package interface_demo;

public class Class_2 extends Class_1
{

	@Override
	public void m3()
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args)
	{
		Int_1.m9();
		
		System.out.println("***** Child Ref + Child Object *****");
		
		Class_2 c2 = new Class_2();
		c2.m1();
		c2.m2();
		c2.m3();
		
		System.out.println(num);
		
		
		System.out.println("***** Parent Ref + Parent Object *****");
		
//		Class_1 c1 = new Class_1();   // -- not possible
//		Int_1 i1 = new Int_1();     // -- not possible
		
		
		System.out.println("***** Parent Ref + Child Object *****");
		
		
		Int_1 c3 = new Class_2(); 
		c3.m1();
		c3.m2();
		c3.m3();
		
		
		Class_1 c4 = new Class_2(); 
		c4.m1();
		c4.m2();
		c4.m3();
		
	}

	@Override
	public void m8()
	{
		// TODO Auto-generated method stub
	}

}
