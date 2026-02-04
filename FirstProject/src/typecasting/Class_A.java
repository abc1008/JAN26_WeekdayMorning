package typecasting;

public class Class_A
{
	
	public static void main(String[] args)
	{
		
		System.out.println();
		System.out.println("*******  Implicit typecasting *****");
		System.out.println();
		
//		Conversion from lower order data type into hiher order
		
		byte num = 10;   // --> int   - 127 to +128
		System.out.println(num);
		
//		SYNTAX: 
//		NewDataType convertedVarName = (NewDataType)VariableToConvert;
		
		int convNum  = (int)num;
		System.out.println(convNum);
		
		
//		b.	Explicit typecasting
		
//		Conversion from higher order data type into lower order

		System.out.println();
		System.out.println("*******  Explicit typecasting *****");
		System.out.println();
		
		
		int x = 129;   // -->  byte 
		System.out.println(x);
		
		byte convX = (byte)x;
		System.out.println(convX);
	}
	

}
