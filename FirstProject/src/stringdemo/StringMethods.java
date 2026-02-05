package stringdemo;

public class StringMethods
{

	public static void main(String[] args)
	{

		String s1 = "Testometer";

//		1. length : total no of chars in given String

		System.out.println(s1.length());

//		2. concat : to join 2 Strings (same as '+')

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
		
//		7. toUpperCase and toLowerCase
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
//		8. trim - to remove leading and trailing spaces
		
		String s3 = "    Testometer       ";
		System.out.println(s3);
		
		String trimmedStr = s3.trim();
		System.out.println(trimmedStr);
		
//		String s1 = "Testometer";     
		
		
		
//		9. indexOf : pass char and get index of it
		
		int idx =s1.indexOf("e");
		System.out.println(idx);
		
//		10. lastIndexOf : to get index of last occurence of given char
		

		int lastIdx =s1.lastIndexOf("e");
		System.out.println(lastIdx);
		
//		11. contains : to verify if given char sequence is present in given string.
		
		System.out.println(s1.contains("ter"));
		
//		12. toCharArray() : convert given String into char Array
		
		 char[] chArr = s1.toCharArray();     // ['T','e','s','t']
		 
		 System.out.println(chArr[0]);
		 System.out.println(chArr[1]);
		 System.out.println(chArr[2]);
		 System.out.println(chArr[3]);
		 System.out.println(chArr[4]);
		 System.out.println(chArr[5]);
		 System.out.println(chArr[6]);
		 System.out.println(chArr[7]);
		 System.out.println(chArr[8]);
		 System.out.println(chArr[9]);
		 
		 System.out.println();
		 
		 for(char c : chArr)
		 {
			 System.out.println(c);
		 }
		 
		
		 System.out.println();
		 
//		14: split : to split given string based on some char
		 
		 String s4 = "Test^meter^ABC^PQR";     
//			String s1 = "TestometeroABCoPQR"; 
		 
		String [] spl  = s4.split("^");
		
		 for(String c : spl)
		 {
			 System.out.println(c);
		 }
		
	}

}
