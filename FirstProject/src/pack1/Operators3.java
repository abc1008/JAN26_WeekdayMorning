package pack1;

public class Operators3 {

	public static void main(String[] args) {

		int a = 21;
		int b = 20;

		boolean result = (a < b) && (a < 100);
		System.out.println("result : " +result);
		
		
		
		boolean result2 = (a < b) || (a < 100) || ((a - b) > 0);
		System.out.println("result2 : " +result2);

	}

}
