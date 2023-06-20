package priorityQueue;

import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueue {

	// Function that get the minimum number in the ArrayList
	// Since Priority queue takes away that of the smallest value first.
	public static int getMin(ArrayList<Integer> arrayList) {
		int min = Collections.min(arrayList);
		System.out.println(min);
		return min;
	}
	
	// Function to get the max number.
	public static int getMax(ArrayList<Integer> arrayList) {
		int max = Collections.max(arrayList);
		System.out.println(max);
		return max;
	}
	
	// Function that acts as a poll for Priority Queue. Important to remember this is going to get the smallest value.
	public static Integer poll(ArrayList<Integer> arrayList) {
		return arrayList.remove(arrayList.indexOf(getMin(arrayList)));
	}
	
	// Function that acts as a peek for Priority Queue.
	public static void peek(ArrayList<Integer> arrayList) {
		System.out.println(getMin(arrayList));;
	}
	
	//Function that will act as a offer to Priority Queue.
	public static boolean offer(ArrayList<Integer> arrayList, int input) {
		return arrayList.add(input);
	}
}
