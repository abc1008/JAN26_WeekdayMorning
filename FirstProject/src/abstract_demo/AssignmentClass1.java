package abstract_demo;

public class AssignmentClass1
{

	public void getSum(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args)
	{
		
//		1. Write a non-static method “getSum(int N)” to calculate the sum from 1
//		to N numbers where N is the argument. 
		
		
		AssignmentClass1 a = new AssignmentClass1();
		a.getSum(10);
		
		
		
		
		
		
	}
}
