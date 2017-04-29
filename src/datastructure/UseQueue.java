package datastructure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> myQueue = new ArrayDeque<>();
		myQueue.add(5);
		myQueue.add(4);
		System.out.println("My Queue:" + myQueue.toString());

		int sum = 0;
		for (Integer number : myQueue) {
			sum += number;
		}
		System.out.println("My Queue sum:" + sum);

		System.out.println("First:" + myQueue.peek());

		myQueue.add(10);//inserting element at the beginning of the list
		System.out.println("New First:" + myQueue.peek());

		System.out.println("My Queue:" + myQueue.toString());

		myQueue.remove(); //removing first element
		System.out.println("New New First:" + myQueue.peek());
		System.out.println("My Queue:" + myQueue.toString());


		myQueue.remove(10); //removing 5 element
		System.out.println("New New First:" + myQueue.peek());
		System.out.println("My Queue:" + myQueue.toString());

		while (myQueue.size()>0){
			myQueue.remove();
		}

		System.out.println("My empty List:" + myQueue.toString());

	}

}
