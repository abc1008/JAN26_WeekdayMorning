package pack1;

public class MethodCategories
{

	public void addition( int num1, int num2 )
	{
//		int a = 10;
//		int b = 20;
		
		int ans = num1 + num2;
		
		System.out.println(ans);
	}
	
	
	
	public String getUserName()
	{
		String userName = "User1";
		
//		System.out.println(userName);
		
		
		return userName;
	}
	
	
	
	public String getEmployeeName(int employeeId)
	{
		String employeeName = null;
		
		if(employeeId == 100)
		{
			employeeName = "ABC";
		}
		else if(employeeId == 101)
		{
			employeeName = "PQR";
		}
		
		return employeeName;
	}
	
	public void getEmpId(String empName)
	{
		int employeeId = 0;
		
		if(empName == "ABC")
		{
			employeeId = 100;
		}
		else if(empName == "PQR")
		{
			employeeId = 101;
		}
		
		System.out.println(employeeId);
	}
	
	public static void main(String[] args)
	{
		MethodCategories mc = new MethodCategories();
		
		mc.addition(20, 30);
		mc.addition(50, 40);
		mc.addition(12, 43);
		
		
		String userName = mc.getUserName();  // method call line
		
		System.out.println(userName);
		
 		String name = mc.getEmployeeName(101);
 		System.out.println("name : " + name);
		
 		
 		mc.getEmpId(name);
	}
	
	
}
