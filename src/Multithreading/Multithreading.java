package Multithreading;

// Multithreading can be done by two methods 

/* 	1. Class extends Thread class (extends Thread)
	2.Class implmenting the interface (implements Runnable)
	
	KEY POINT : 
	Medthod run() is overrided in the class impletmenting or extending a thread, 
	Without run method the thread will not execute 
*/

// Multi threading is used to execute multiple paths of code at the same time or different times 

public class Multithreading {

	public static void main(String[] args) {
		
	Threading1 multithread = new Threading1(4);
	Threading1 multithread1 = new Threading1(5);
	
	multithread.run();
	multithread1.run();
	
	System.out.println("");
	System.out.println("After run method.....");
	
	multithread.start();
	multithread1.start();
	
	System.out.println("For loop.....");
	// insted of creating multipe objects we can simply use an for loop to run the thread 
	
	for (int i=0; i<=3; i++) {
		Threading1 multithread3 = new Threading1(i);
		multithread3.start();
		
		try {
			multithread3.join();
		} catch (InterruptedException e) {
			
		}
		
		
	}
		
		// Using interface 
		
		Threading2 Usinginterface = new Threading2();
		Thread mythread = new Thread(Usinginterface);
		Thread mythread1 = new Thread(new Threading2());
//		Usinginterface.start();  Error since the object in the 
//		
		mythread.start();
	mythread1.start();
	

	}

}
