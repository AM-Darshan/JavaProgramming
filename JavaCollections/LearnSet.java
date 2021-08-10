package JavaCollections;

import java.util.*;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<Student> studentSet= new HashSet<>();
		
		studentSet.add(new Student("Ajay",2));
		studentSet.add(new Student("Ramesh",4));
		studentSet.add(new Student("Shivam",3));
		studentSet.add(new Student("Rohit",2));
		
		System.out.println(studentSet);
		
		Student s1= new Student("Akshay",5);
		Student s2= new Student("Anuj",5);
		System.out.println(s1.equals(s2));
		//Set<Integer> set= new HashSet<>();
		//O(1)
		
		//Set<Integer> set= new LinkedHashSet<>();
		//elements are added in the order of add()
		
		//Set<Integer> set= new TreeSet<>();
		//elements are added in sorted order, uses binary Search tree
		//log(n)
		
//		set.add(32);
//		set.add(3);
//		set.add(52);
//		set.add(21);
//		set.add(65);
//		
//		System.out.println(set);
//		
//		set.remove(52);
//		System.out.println(set);
//		
//		System.out.println(set.contains(100));
//		System.out.println(set.contains(32));
//		
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());
	}

}
