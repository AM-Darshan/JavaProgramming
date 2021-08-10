package JavaCollections;

import java.util.*;

public class LearnMap {

	public static void main(String[] args) {
		//Map<String,Integer> num= new HashMap<>();
		
		Map<String,Integer> num= new TreeMap<>();
		//adds elements in alphabetical order
		num.put("One", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		num.put("Four", 4);
		num.put("Five", 5);
//		if(!num.containsKey("Two")) {
//			num.put("Two", 23);
//		}
		//num.putIfAbsent("Two", 23);
		System.out.println(num);
		System.out.println(num.containsKey("Three"));
		System.out.println(num.containsValue(1));
		
		num.remove("Three");
		num.remove("Four", 4);
		System.out.println(num);
		
		System.out.println(num.isEmpty());
		for(Map.Entry<String, Integer> e: num.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String Key:num.keySet()) {
			System.out.println(Key);
		}
		for(Integer value: num.values()) {
			System.out.println(value);
		}
		
//		num.clear();
//		System.out.println(num.isEmpty());
	}

}
