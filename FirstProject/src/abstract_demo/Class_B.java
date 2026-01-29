package abstract_demo;

public abstract class Class_B extends Class_A
{
	public Class_B()
	{
		super(4);
		System.out.println("Class_B Constructor");
	}
	
	

	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	
	
	public void m3(int a)
	{
		System.out.println("m3");
	}
	
	
//	public void m4()
//	{
//		System.out.println("m3");
//	}

}
