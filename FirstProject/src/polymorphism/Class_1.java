package polymorphism;

public class Class_1
{
	public int m1()
	{
		System.out.println("m1");
		
		return 8;
	}
	
	void m1(int num)
	{
		System.out.println("int - m1");
	}
	
	private static void m1(char c)
	{
		System.out.println("char - m1");
	}
	
	protected void m1(int num, char ch)
	{
		System.out.println("int,char - m1");
	}
	
	public void m1(char c, int num)
	{
		System.out.println("char, int - m1");
	}
	
	public static void main(String[] args)
	{
		
		Class_1 c1 = new Class_1();
		c1.m1();
		
		m1('f');
	}
	

}
