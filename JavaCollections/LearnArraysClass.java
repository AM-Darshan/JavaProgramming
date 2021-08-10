package JavaCollections;

import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int index= Arrays.binarySearch(num, 4);
		System.out.println("The index of element 4 is: " + index);
		
		Integer[] nums= {51,22,34,4,15,46,75,84,9,210};
		Arrays.sort(nums);
		
		//Arrays.fill(nums, 12);
		
		for(int i:nums) {
			System.out.println(i + " ");
		}
	}

}
