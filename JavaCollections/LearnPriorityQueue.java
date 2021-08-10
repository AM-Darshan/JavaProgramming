package JavaCollections;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> pq= new PriorityQueue<>();
		//MaxHeap using priority queue, Max element has more priority
		//Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		
		System.out.println(pq);//MinHeap using priority queue
		
		pq.poll(); //Minvalue in the MinHeap is removed using heapify
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}

}
