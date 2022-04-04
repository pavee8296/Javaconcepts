 package Collectionframework;

import java.util.*;
public class Queue_java {

	public static void main(String[] args) {
		
		// FIRST IN FIRST OUT 
		
		ArrayList<Integer> blist = new ArrayList<Integer>();
		Queue <Integer> q = new LinkedList<Integer>(); 
		
		// since queue is an interface we can not create a object for it so we can use linkedlist here to create a object

		q.add(3);
		q.add(100);
		q.add(15);
		q.add(96);
		q.add(100);
		
		
		Iterator itr = blist.iterator();
		System.out.println("The head is:" + q.peek());// first element 
		
		System.out.println("Removed:" + q.remove()); // removes the first element and replaces with the second element to the the first
		
		System.out.println("The head is :"+ q.peek());// after removing the first element we take a look at the second element 
		


		System.out.println("");
		
		System.out.println("Priority queue");
PriorityQueue <Integer> pq = new PriorityQueue<Integer>(); 
		
		// Priority queue is used for sorting 

				pq.add(1);
				pq.add(15);
				pq.add(3);
				pq.add(4);
		
				
		
		
		System.out.println("The head is:" + pq.peek());// first element of the sorted list 
		
		System.out.println("Removed:" + pq.remove()); // removes the first element  and replaces with the second element to the the first
		
		System.out.println("Removed:" + pq.remove());
		
		System.out.println("Removed:" + pq.remove());
		
		System.out.println("The head is :"+ pq.peek());// after removing the first element we take a look at the second element on the sorted list  
		
	}

}
