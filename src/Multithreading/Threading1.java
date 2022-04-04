package Multithreading;

// to see which number is printing which thread we will use this construtor 

public class Threading1 extends Thread {
	
	private int threadnumber;
	 public Threading1 (int threadnumber) {
		this.threadnumber = threadnumber;
		
	}

	@Override
	public void run() { // overriding the run method which is inherited from the Thread class

		for (int i = 1; i <=3; i++) {
			System.out.println(i + " from the thread" +" "+ threadnumber);
			
			// Even during an execption the other threads will be executed 
			if(threadnumber == 3) {
				throw new RuntimeException();  
			}


				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {					
					
				} 

		}
	}

}
