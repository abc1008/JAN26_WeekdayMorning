package collections_demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo
{

	
	public static void main(String[] args)
	{
		
//		SYNTAX: 
		
//		CollectionType<DataType> collectionName = new CollectionType<DataType>(); --> to create empty collection
		
		Set<Integer> set1 = new HashSet<>();
		System.out.println(set1);
		
//		Insert
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(null);
		set1.add(30);
		set1.add(40);
		set1.add(60);

		
		System.out.println(set1);
		
//		remove
		
		boolean isRemoved = set1.remove(500);
		System.out.println("isRemoved : "+isRemoved);
		
		System.out.println(set1);
		
		
//		size
		
		System.out.println("size : " + set1.size());
		
//		contains
		
		System.out.println("contains : " + set1.contains(400));
		
		
//		conversion from list to set
		
		List<Integer> list1 = new ArrayList<>();   // create an empty list
		System.out.println(list1);
		
		list1.add(100);  // insert data
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		list1.add(300);
		list1.add(400);
		
		
		HashSet<Integer> set2 = new HashSet<>(list1);
		
		System.out.println();
		
		System.out.println("set2 : "+set2);
		
		
//		iterate
		
		System.out.println();
		
		for(Integer i : set1)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
//		iterator()
		
		Iterator<Integer> itr = set1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
