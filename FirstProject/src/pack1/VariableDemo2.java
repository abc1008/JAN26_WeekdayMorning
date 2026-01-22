package pack1;

public class VariableDemo2 {
	
	int num = 20; 

	static int num2 = 50; 
	
	public static void main(String[] args) 
	{
		VariableDemo2 vd1 = new VariableDemo2();
		System.out.println("vd1.num : " + vd1.num);

		vd1.num = 30;   // re-initialization
		System.out.println("vd1.num : " + vd1.num);
		
		
		VariableDemo2 vd2 = new VariableDemo2();
		System.out.println("vd2.num : " + vd2.num);
		
		
		VariableDemo2 vd3 = new VariableDemo2();
		System.out.println("vd3.num : " + vd3.num);
		
		System.out.println();
		System.out.println("******** Static Variable ************");
		System.out.println();
		
		
		System.out.println("vd1.num2 : " + vd1.num2);
		vd1.num2 = 60;
		System.out.println("vd1.num2 : " + vd1.num2);
		
		
		System.out.println("vd2.num2 : " + vd2.num2);

		System.out.println("vd3.num2 : " + vd3.num2);
		
		
		
	}

}
