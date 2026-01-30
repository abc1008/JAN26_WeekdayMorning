package interface_demo;

public interface Int_1
{
	int num = 20;   // By default “public,static,final”
	

	public void m1();   //by default abstract
	
	public void m2(); 
	
	public void m3(); 
	
	public void m8(); 
	
	
	public static void m9()
	{
		System.out.println("m9 Static");
	}
	
	public static void main(String[] args)
	{
		m9();
		
//		num = 27;
		
		System.out.println(num);
	}
	
}
