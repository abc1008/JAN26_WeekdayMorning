package pack1;

public class ArrayDemo {

	public static void main(String[] args) 
	{

		int num = 50;
		
		System.out.println("Git Test");

		String s1 = "abc"; // 'Mon', "Tue" ..

//		SYNTAX 1: 

//		DataType [] arrayName = { data1, data2, data3,... data_N  };

//		Array Deceleration + initialization
		int[] numArray = { 50, 60, 70, 80, 90 }; // total ele = 5
		String[] sArray = { "Monday", "Tuesday", "Wednesday" };

		int num3 = numArray[3];
		System.out.println("num3 : " + num3);

		int num4 = numArray[4];
		System.out.println("num4 : " + num4);

		int length = sArray.length;
		System.out.println(length);

		numArray[3] = 600; // update element in array

		System.out.println(numArray[3]);

//		SYNTAX 2: 

//		DataType [] arrayName = new DataType[lengthOfArray];

//		lengthOfArray : total elements to be added

		String[] sArray2 = new String[5]; // array deceleration

		int[] numArray2 = new int[5];

		System.out.println("numArray2[1] : " + numArray2[1]);

		System.out.println("sArray2 [3] : " + sArray2[3]);

//		Insert data into array : array initialization
		numArray2[0] = 100;
		numArray2[1] = 200;
		numArray2[2] = 300;
		numArray2[3] = 400;
		numArray2[4] = 500;

		System.out.println("numArray2[0] : " + numArray2[0]);
		System.out.println("numArray2[1] : " + numArray2[1]);
		System.out.println("numArray2[2] : " + numArray2[2]);
		System.out.println("numArray2[3] : " + numArray2[3]);

	}
}
