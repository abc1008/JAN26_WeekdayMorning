package pack1;

public class ControlStatements2 {

	
	public static void main(String[] args) {
		
//		SYNTAX : switch case 
		
//		switch(expression)
//		{
//			case a : 
//				code to execute
//			break;
		
//			case b : 
//				code to execute
//			break;
		
//			case c : 
//				code to execute
//			break;
		
//			default : 
//				code to execute when no case is matched
//			break;
//		}
		
		
//		pass in number 2 --> print monday
//		pass in number 5 --> print thursady.. 
		
		int dayNum = 3;
		
		switch(dayNum)
		{
			case 1 : 
				System.out.println("Sunday");
				break;
			
			case 2 : 
				System.out.println("Monday");
				System.out.println("Monday");
				break;
			
			case 3 : 
				System.out.println("Tuesday");
				System.out.println("Tuesday");
				System.out.println("Tuesday");
				break;
			
			case 4 : 
				System.out.println("Wednesday");
				System.out.println("Wednesday");
				break;
			
			case 5 : 
				System.out.println("Thursday");
				break;
			
			case 6 : 
				System.out.println("Friday");
				break;
			
			case 7 : 
				System.out.println("Saturday");
				break;
			
			default: 
				System.out.println("dayNum is incorrect");
		
		}
		
//		System.out.println("out of switch block");
		
		
		
		
	}
}
