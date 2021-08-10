package JavaCollections;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<>();
		//List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);
        ls.add(5);
        System.out.println(ls);
		
        ls.add(3,4);	//(index,value)
		System.out.println(ls);
		 
		List<Integer> newls = new ArrayList<>();
		newls.add(100);
		newls.add(150);
		
		ls.addAll(newls); // add another entire list at the end
		System.out.println(ls);
		 
		System.out.println(ls.get(1)); //index-> value
		
		ls.remove(1); //remove at the index
		System.out.println(ls);
		
		ls.remove(Integer.valueOf(100)); // remove a particular value of datatype
		System.out.println(ls);
		
		newls.clear(); // clears entire list
		System.out.println(newls);
		
		ls.set(2,100); // (index, element) at a index set the value 
		System.out.println(ls);
		
		System.out.println(ls.contains(50)); // returns boolean, checks for the element in the list
		
		//traversing/ iterate
		for(int i=0; i < ls.size(); i++) {
			System.out.println("the element is: " + ls.get(i));
		}
		
		for(Integer ele:ls) {
			System.out.println("element for: "+ ele);
		}
		
		Iterator<Integer> it= ls.iterator();
		
		while(it.hasNext()) {
			System.out.println("iterator: " + it.next());
		}
	}

}
