package datastructure;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Stack<Integer> myStack = new StringStack();
		myStack.add(5);
		myStack.add(4);
		System.out.println("My Stack:" + myStack.toString());

		int sum = 0;
		for (Integer number : myStack) {
			sum += number;
		}
		System.out.println("My Stack sum:" + sum);

		System.out.println("First:" + myStack.peek());

		myStack.add(10);//inserting element at the beginning of the list
		System.out.println("New First:" + myStack.peek());

		System.out.println("My Stack:" + myStack.toString());

		myStack.pop(); //removing first element
		System.out.println("New New First:" + myStack.peek());
		System.out.println("My Stack:" + myStack.toString());

		while (myStack.size()>0){
			myStack.pop();
		}

		System.out.println("My empty List:" + myStack.toString());
	}

}
