package priorityQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class Priority {

	public static void main(String[] args) {

		// Hard-coding the ArrayList with values using .add(), (Using integers).
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		PriorityQueue PriorityQueue = new PriorityQueue();
		// Adding values to the ArrayList.
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(1);
		arrayList.add(6);

		// Printing out the original ArrayList
		System.out.println("A list of integers in the array list before using PriorityQueue methods:");
		System.out.println(arrayList);
		
		// All the methods that Priority-Queue will be displayed here 
		// Offer must contain the ArrayList and the integer to input since it connected to a ArrayList.
		PriorityQueue.getMin(arrayList);
		PriorityQueue.getMax(arrayList);
		PriorityQueue.peek(arrayList);
		PriorityQueue.poll(arrayList);
		PriorityQueue.poll(arrayList);
		PriorityQueue.offer(arrayList, 5);
		
		System.out.println(arrayList);

	}
}

// References:
// https://www.youtube.com/watch?v=wptevk0bshY : to really get the in and out of Priority Queue.