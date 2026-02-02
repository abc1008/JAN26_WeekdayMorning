package exception_handling;


public class Class_3
{
	
	public static void add(int num) // 2,3, 4
	{
		System.out.println("num : " + num); // 2, 3, 4
		
		if(num > 0)
		{
			num = num+1; // 3, 4
			add(num);  // 3, 4
		}
	}
	
	
	public static void main(String[] args)
	{
		add(2);
	}
}
