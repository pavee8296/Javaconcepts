package Java;

class mainrunthread implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[])
{  
	mainrunthread m1=new mainrunthread();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}

// start run method 
// runable 