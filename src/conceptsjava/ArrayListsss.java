package conceptsjava;

import java.util.*;

public class ArrayListsss {

	public static void main(String[] args) {

// Fixed size array 

		int a[] = new int[5];

// import java.util.* is needed to use array list 

		// Flexible array, supports redundancy
		
		// Arraylist is a dynamic array which will increase its size by 50%

		/*
		 * We can't use primitive data types inside the angular brackets NOTE: String is
		 * not a primitive data type
		 * 
		 * We can only use wrapper class or the class itself in the angular brackets, or
		 * we can leave it empty
		 * 
		 */
		// Array list also know as generic programming

		LinkedList<Integer> alist = new LinkedList<Integer>();
		

		// For loop without braces the result will be just the final loop

		for (int i = 1; i <= 10; i++)
			alist.add(i);
		// Supports redundancy
		alist.add(100);
		alist.add(100);
		alist.add(200);
		System.out.println(alist);

		// We can store any type of data in the list

		ArrayList slist = new ArrayList();
		slist.add("Jhon");
		slist.add(1);
		slist.add('t');
		slist.add(23.5);

		System.out.println(slist);

		// GET A DATA
		// Since the Array List class is written using ARRAY we can get data of a
		// particular index

		System.out.println(alist.get(5)); // We are getting the data form the 5th index

		// UPDATE A DATA

		// We can even update the list using set method

		alist.set(1, 100); // 1st index data will be changed to 100
		System.out.println(alist);

		// REMOVE DATA

		// We can also remove a data from the list
		alist.remove(6); // 6th index data will be removed
		System.out.println(alist);

		// There are plenty of methods available in the list we can search for a data,
		// we can clone a data, we can clear the complete list

		// IF WE WANT ALL THE DATA SEPERATE

		for (int i : alist)

			// ****** the (:) in the condition means that "for every integer present in the
			// list

			// for (String i: words)

			// OR

			// for (int i = 0; i < words.length; i++) {}

			System.out.println(i);

		// We used for each and iterated easily in the above program

		// We can even create an object using ITERATOR class

		Iterator<Integer> i = alist.iterator(); // since we need the iterator for alist we are using aslist here,
		// we can also specify the data type in the angular bracket
		// i is an object here
		System.out.println("printing elements using iterator");
		System.out.println(i.next()); // first index

		// if we want all the data from the index we can use
		System.out.println("Printing all elements using iterator & loop");
		while (i.hasNext()) { // hasnext is a boolean method it checks until the last element
			System.out.println(i.next());
		}

	}

}
