package exception_handling;

public class Class_1
{
	
	public void add()
	{
		try
		{
//			add logic
		}
		catch (Exception e) 
		{
			
		}
		
	}
	
	public static void main(String[] args)
	{
		int ans = 0;
		try
		{
			int a = 10;
			int b = 0;  	// infinity
			ans = a/b;   // arithmatic exception
			System.out.println("After divide operation");
			
//			arr[11] = 300;
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception found : "+ex.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("ans : "+ans);
		
	}
	
	
	
	
//	try
//	{
//		Excel file open
//		Data Read  -- exception found
	
//		Connect with DB
//		Read the data  -- exception found
	
//		
//	}
//	catch()
//	{
		
//	}
//	finally
//	{
//		File Close
//		disconnect
//	}

}
