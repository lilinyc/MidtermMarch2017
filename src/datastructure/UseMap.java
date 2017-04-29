package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String,Integer > myMap = new HashMap<String,Integer>();
		myMap.put("nine", 9);
		myMap.put("five", 5);
		System.out.println("My Array List:" + myMap.toString());

		int sum = 0;
		for (String key : myMap.keySet()) {
			sum += myMap.get(key);
			System.out.println(key);
		}
		System.out.println("My Map sum:" + sum);

		System.out.println("First integer in the array list:" + myMap.get("nine"));

		myMap.put("nine",10);//inserting element at the beginning of the list
		System.out.println("New First:" + myMap.get("nine"));
		System.out.println("Second:" + myMap.get("five"));
		System.out.println("My Map:" + myMap.toString());

		myMap.remove("nine"); //removing first element
		System.out.println("My Map:" + myMap.toString());

		for (String key : myMap.keySet()) {
			myMap.remove(key);
		}

		System.out.println("My empty List:" + myMap.toString());
	}

}
