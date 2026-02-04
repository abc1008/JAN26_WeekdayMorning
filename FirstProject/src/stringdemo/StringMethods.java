package stringdemo;

public class StringMethods
{

	public static void main(
			String[] args
	)
	{

		String s1 = "Testometer";

//		1. length : total no of chars in given String

		System.out.println(s1.length());

//		2. concat : to join 2 Strings

		String s2 = s1.concat(" Institute");
		System.out.println(s2);

//		3. charAt();  : to get the char present at given index

		char fifthChar = s1.charAt(5);
		System.out.println(fifthChar);

//		String s1 = "Testometer";     

//		4. equals : used to verify equality of 2 Strings

		System.out.println("Is Equal : " + s1.equals("testometer"));
		System.out.println("equalsIgnoreCase : " + s1.equalsIgnoreCase("testometer"));

//		5. SubString: continuous part of String

		String subString = s1.substring(5);
		System.out.println(subString);

		String subString2 = s1.substring(5, 8);
		System.out.println(subString2);
		
//			String s1 = "Testometer";   
		
		
//		6. replace: replacing a char
		
		String replaced =  s1.replace('e', 'Z');
		System.out.println(replaced);
		

	}

}
