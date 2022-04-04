package Java;

class singlethread extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
	singlethread t1=new singlethread();  
t1.start();  
 }  
} 
