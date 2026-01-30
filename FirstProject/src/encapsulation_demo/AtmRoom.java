package encapsulation_demo;

public class AtmRoom
{
	
	public static void main(String[] args)
	{
		BankAccount ba  = new BankAccount();
//		System.out.println(ba.accBalance);
		
		double accBalance = ba.getBalance();
		
		
		System.out.println(accBalance);
	}

}
