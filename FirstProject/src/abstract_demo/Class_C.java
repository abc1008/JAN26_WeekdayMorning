package abstract_demo;

public class Class_C extends Class_B
{
	public Class_C()
	{
		System.out.println("Class_C  Constructor");
	}

	@Override
	public void m4()
	{
		System.out.println("m4");
	}

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("**** Child Ref + Child Object *****");
		System.out.println();
		
		
		Class_C c1 = new Class_C();
		
		c1.m1();
		c1.m2();
		c1.m3(0);
		c1.m4();
		
		
		System.out.println();
		System.out.println("**** Parent Ref + Parent Object *****");
		System.out.println();
		
//		Class_B b1 = new Class_B();  -- cannot create object of abstarct class. 
		
		
		
		
		
		System.out.println();
		System.out.println("**** Parent Ref + Child Object *****");
		System.out.println();
		
		Class_A ca = new Class_C();
		ca.m1();
		ca.m2();
		ca.m3(0);
		ca.m4();
		
		
		
		
		
		
//		Parent Class - Abstract     -- click()
		
//		Chrome, Edge    -- click()
		
		
//		Chrome c = new Chrome();   c.click();
		
//		Parent p = new Chrome();   p.click
		
		
//		Edge e = new Edge();   e.clik();
		
//		Parent p2 = new Edge();   p2.click
		
		
//		***
//		Parent p = new Edge();
//		p = new Chrome();
		
	}

}
