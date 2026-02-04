package typecasting;

public class Child extends Parent
{
	public static void main(String[] args)
	{
		
		System.out.println();
		System.out.println("**** Up Casting ****");
		System.out.println();
		
//		int num = 10;
		Child cRef = new Child();   // --> Parent
		
		
//		SYNTAX: 
//		NewDataType convertedVarName = (NewDataType)VariableToConvert;
		
		Parent convCRef = (Parent)cRef;
//		Parent convCRef = new Child(); 
		
//		Overloaded --> Parent
//		Overridden --> Child
		
		
		
		
		System.out.println();
		System.out.println("**** Down Casting ****");
		System.out.println();
		
		Parent pRef = new Parent();   // --> Child
		
		Child convPRef = (Child)pRef;   // not possible in java
		
//		Child convPRef = new Parent();
		
		
	}
}
