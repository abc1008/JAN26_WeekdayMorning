package pack1;

public class VariableDemo3 {

	
	int num = 20;   // non-static or global
	int num2 = 260;   
	static int num3 = 30;
	int num4 = 40;
	
	
	public void m1()
	{
		int num = 20;   // local 
		System.out.println("num : " + num);
		
//		VariableDemo2 vd2 = new VariableDemo2();
//		System.out.println("num : " + vd2.num);
		
		System.out.println("num : " + this.num3);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		VariableDemo3 vd2 = new VariableDemo3();
		vd2.m1();
		
//		System.out.println("num : " + this.num);

	}

}
