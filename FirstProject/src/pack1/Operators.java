package pack1;

public class Operators {
	
	
	public static void main(String[] args) {
		
//		a.	Pre-Increment ( ++ ) 
		int a = 60;
		int b = ++a;  //First value of a will be incremented by 1 and then it will be assigned to b
		
		System.out.println(b);
		
//		b.	Post-Increment ( ++ ) 
		int x = 50;
		System.out.println(x);
		
		int y = (x++); //First value of x will be assigned to y and then value of x incremented by 1
		System.out.println(y);
		System.out.println(x);
		
//		c.	Pre- Decrement ( -- )
		int p = 80;
		int q = --p;  //First value of p will be decremented by 1 and then it will be assigned to q
		System.out.println(q);
	

//		d.	Post- Decrement ( -- )
		
		int r = 100;
		int s = r--;  //First value of r will be assigned to s and then value of r decremented by 1
		
		System.out.println(s);
		System.out.println(r);
	}
	
	
	
	
	
	
	

}
