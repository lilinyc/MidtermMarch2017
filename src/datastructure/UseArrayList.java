package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(9);
		myList.add(14);
		System.out.println("My Array List:" + myList.toString());

		int sum = 0;
		for (Integer number : myList) {
			sum += number;
		}
		System.out.println("My List sum:" + sum);

		System.out.println("First integer in the array list:" + myList.get(0));

		myList.add(0,10);//inserting element at the beginning of the list
		System.out.println("New First:" + myList.get(0));
		System.out.println("Second:" + myList.get(1));
		System.out.println("My List:" + myList.toString());

		myList.remove(0); //removing first element
		System.out.println("New New First:" + myList.get(1));
		System.out.println("My List:" + myList.toString());

		while (myList.size()>0){
			myList.remove(0);
		}

		System.out.println("My empty List:" + myList.toString());

	}


	}


