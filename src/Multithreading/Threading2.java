package Multithreading;

public class Threading2 implements Runnable  {

//	private int threadnumbers;
//	public Threading2 (int threadnumber) {
//		this.threadnumbers = threadnumber;
//		
//	}

	@Override
	public void run() { // overriding the run method which is inherited from the Thread class

		for (int i = 1; i <=3; i++) {
			System.out.println(i);
			
				try {
					Thread.sleep(500); // delaying the execution of code of 1sec
			} catch (InterruptedException e) {
			}
		}
	}

}


