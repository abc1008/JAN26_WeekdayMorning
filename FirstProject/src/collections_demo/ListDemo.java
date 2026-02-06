package collections_demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListDemo
{
	
	public static void main(String[] args)
	{
		
//		SYNTAX: 
		
//		CollectionType<DataType> collectionName = new CollectionType<DataType>(); --> to create empty collection
		
	
	
		List<Integer> list1 = new ArrayList<>();   // create an empty list
		System.out.println(list1);
		
		list1.add(100);  // insert data
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		list1.add(300);
		list1.add(400);
		
		System.out.println(list1);
		
		System.out.println("size : "  + list1.size());
		
		int data = list1.get(3);   // to fetch single data
		
		System.out.println("data : " +data);
		
		
		Integer removedData = list1.remove(2);  // remove
		System.out.println("removedData : "+removedData);
		
		System.out.println(list1);
		list1.add(700);
		System.out.println(list1);
		
		
//		to update data
		list1.set(3, 6009);
		System.out.println(list1);
		System.out.println(list1.contains(400));
		
		
//		Iterate over list
		
		for(Integer i : list1)
		{
			System.out.println(i);
		}
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(800);
		list2.add(900);
		list2.add(6600);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		
		
//		iterator();
		
		System.out.println();
		
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext())
		{
			Integer data1 = itr.next();
			System.out.println(data1);
		}
		
		
//		Conversion
		
		HashSet<Integer> set1 = new HashSet<>();
		System.out.println(set1);
		
//		Insert
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(30);
		set1.add(40);
		set1.add(60);

		List<Integer> list3 = new ArrayList<>(set1);  
		
		System.out.println("list3 : "+list3);
		
		System.out.println(list3.get(3));
		
	}

}
