package collections_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo
{

	public static void main(String[] args)
	{
//		Map<KeyDataType,ValueDataType> mapName = new HashMap<KeyDataType,ValueDataType>();

		Map<String, Integer> map1 = new HashMap<>();

		System.out.println(map1);

//		Insert

		map1.put("Pune", 100000);
		map1.put("Mumbai", 200000);
		map1.put("Pimpri", 300000);
		map1.put("Delhi", 400000);
		map1.put("Nagpur", 500000);
		map1.put("Mumbai", 2500000);
		map1.put("Jaipur", 500000);
		map1.put(null, 500000);
		map1.put(null, 700000);

		System.out.println(map1);

//		fetch
		Integer delhiPopulation = map1.get("Delhi");
		System.out.println("delhiPopulation : " + delhiPopulation);

//		remove

		Integer removedValue = map1.remove("Mumbai");
		System.out.println("removedValue : " + removedValue);
		System.out.println(map1);

//		to get all keys

		Set<String> keySet = map1.keySet();
		System.out.println(keySet);

		Collection<Integer> allValues = map1.values();
		System.out.println(allValues);

		
		for(String k : keySet)
		{
			System.out.println(k);
		}
		
		for(Integer k : allValues)
		{
			System.out.println(k);
		}
		
//		to get all values
		 Iterator<Integer> itr = allValues.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
//		 contains
		 
		 System.out.println(map1.containsKey("Punee"));
		 System.out.println(map1.containsValue(3005000));
		 
		
	}
}
