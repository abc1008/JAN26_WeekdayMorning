package pack1;

public class VariableCalling {
	

	
	
	
	
	public static void main(String[] args) {
		
		
//		Syntax for calling static variable outside current class:  ClassName.variableName;

		System.out.println(VariableDemo.num);
		
		VariableDemo ref2 = new VariableDemo();
		System.out.println(ref2.num);
		
		
		
		
//		Syntax for calling non-static variable outside current class:
//		obectRef.variableName;
		
		System.out.println(ref2.num2);
		
		
		
	}

}
