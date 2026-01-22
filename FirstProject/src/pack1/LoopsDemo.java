package pack1;

public class LoopsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		
		System.out.println();
		System.out.println("*** while loop ***");
		System.out.println();
		
//		1.	while loop: 
		
//		SYNTAX: 
			
//		while(boolean condition)
//		{
			// code to repeat
//		}
		
		int num = 0;
		
		while(num < 5)  
		{
			System.out.println("while Loop : "+num);
//			num = num + 1;   // 1, 2,3,4,5
			num++;
		}
		
		System.out.println("out of while loop");
		
		
		System.out.println();
		System.out.println("*** do while loop ***");
		System.out.println();
		
//		SYNTAX: 
			
//		do
//		{
			// code to repeat
//		}
//		while(boolean condition);
		
		int num2 = 0;
		
		do
		{
			System.out.println("do while Loop");
			num2++;  // 1, 2,3,4,5
		}
		while(num2 < 5);
		
		System.out.println("out of while do-loop");
		
		
		
		System.out.println();
		System.out.println("*** for loop ***");
		System.out.println();
		
//		SYNTAX: 
		
//					1					2,5,8			4,7
//		for(variableInitialization; condition; increment/decrement)
//		{
//				3,6,9
			// code to repeat
//		}
		
		
		for(int num3 = 0; num3 < 5; num3++)
		{
			System.out.println("for Loop");
		}
		
		System.out.println("out of for do-loop");
		
		
		String [] sArray = {"ABC", "PQR", "XYZ", "TUV", "QWE"};
		
		System.out.println();
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		System.out.println(sArray[3]);
		System.out.println(sArray[4]);
		
		
		System.out.println("*** using for loop ***");
		
		for(int index = 0; index < 5; index++)
		{
			System.out.println(sArray[index]);
		}
				
		System.out.println("*** using for-each loop ***");
		
//		SYNTAX: 
		
//		for( dataType variable : collectionVariable)
//		{
			// code to repeat
//		}
		
//		without index, code will be repeated until last element in the collection
		for(String s : sArray)   
		{
			System.out.println(s);
		}
	}

}
