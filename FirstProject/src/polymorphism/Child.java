package polymorphism;

public class Child extends Parent
{
	final static int num  = 11;
	
	public int m1()
	{
		System.out.println("Child - m1");
		return 8;
	}
	
	public void m2(int n)
	{
		System.out.println("Child - int - m2");
	}
	
	public void m3(int num)
	{
		System.out.println("Child - int - m3");
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("*** Child Ref + Child Object ****");
		System.out.println();
		
		Child c = new Child();
		c.m1();   // overridden   - Object deciding
		c.m2(3);  // overridden	  - Object deciding
		c.m3(8);  // overloaded   - ref variable deciding
		
		System.out.println();
		System.out.println("*** Parent Ref + Parent Object ****");
		System.out.println();
		
		Parent p = new Parent();
		p.m1();   // overridden   - Object deciding
		p.m2(4);  // overridden   - Object deciding
		p.m3('h');  // overloaded   - ref variable deciding
		 
		
		System.out.println();
		System.out.println("*** Parent Ref + Child Object ****");
		System.out.println();
		
		Parent p2 = new Child();
		p2.m1();    // overridden  - Object deciding
		p2.m2(0);   // overridden  - Object deciding
		p2.m3('f'); // overloaded  - ref variable deciding
		
		
		System.out.println();
		System.out.println("*** Child Ref + Parent Object ****");
		System.out.println();
		
		
//		Child c2 = new Parent();   -- not possible becaise 
		
		
		System.out.println(num);
//		num = 11;
		
		System.out.println(num);
		
	}
}
