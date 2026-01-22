package pack1;

public class Operators4 {

	public static void main(String[] args) {

		int a = 22;
		int b = 5;
		
		int ans = a/b;  // remainder = 3
		
		System.out.println("ans : " + ans);

		int rem = a % b;
		System.out.println("rem : " + rem);
		
		
		System.out.println();
		
		int num = 52;   // even or odd
		
//		even = Completely divisible by 2 , remainder = 0
//		odd = Not completely divisible by 2
		
		int rem2 = (num % 2);
		boolean isEven = (rem2 == 0);
		System.out.println("rem2 : " + rem2);
		System.out.println("isEven : " + isEven);
		
		

	}

}
