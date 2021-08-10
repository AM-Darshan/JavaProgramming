package JavaCollections;

import java.util.*;

public class LearnCollectionsClass {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(9);
		list.add(76);
		list.add(29);
		list.add(75);
		
		System.out.println("min element " + Collections.min(list));
		System.out.println("max element " + Collections.max(list));
		System.out.println(Collections.frequency(list, 9));
		
		Collections.sort(list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		List<Student> studentlist= new ArrayList<>();
		
		studentlist.add(new Student("Ajay",1));
		studentlist.add(new Student("Ramesh",4));
		studentlist.add(new Student("Shivam",3));
		studentlist.add(new Student("Rohit",2));
		
		Student s1= new Student("Akshay",3);
		Student s2= new Student("Anuj",5);
		System.out.println(s1.compareTo(s2));
		
		Collections.sort(studentlist);
		System.out.println(studentlist);
		
		Collections.sort(studentlist,new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(studentlist);
		
		Collections.sort(studentlist, (o1,o2) -> o1.name.compareTo(o2.name));
		System.out.println(studentlist);
		
	}

}
