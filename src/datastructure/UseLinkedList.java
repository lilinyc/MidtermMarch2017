package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(5);
        myList.add(4);
        System.out.println("My List:" + myList.toString());

        int sum = 0;
        for (Integer number : myList) {
            sum += number;
        }
        System.out.println("My List sum:" + sum);

        System.out.println("First:" + myList.peek());

        myList.add(0,10);//inserting element at the beginning of the list
        System.out.println("New First:" + myList.peek());
        System.out.println("Second:" + myList.get(1));
        System.out.println("My List:" + myList.toString());

        myList.remove(0); //removing first element
        System.out.println("New New First:" + myList.peek());
        System.out.println("My List:" + myList.toString());

        while (myList.size()>0){
            myList.remove(0);
        }

        System.out.println("My empty List:" + myList.toString());

    }

}
