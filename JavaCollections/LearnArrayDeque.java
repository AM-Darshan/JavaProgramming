package JavaCollections;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq= new ArrayDeque<>();
		//used for sliding window technique
		//stack and queue can be implemented using ArrayDeque
		adq.offer(23);
		adq.offerFirst(12);//adds at first
		adq.offerLast(45);//adds as last, same as offer
		adq.offer(26);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		System.out.println("poll()" + adq);
		
		System.out.println(adq.pollFirst());
		System.out.println("pollfirst() " + adq);
		
		System.out.println(adq.pollLast());
		System.out.println("pollLast() " + adq);
		
	}

}
