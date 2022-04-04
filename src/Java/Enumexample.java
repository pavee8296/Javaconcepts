package Java;

enum Season { WINTER, SPRING, SUMMER, FALL }
class Enumexample {
		//enum Season { WINTER, SPRING, SUMMER, FALL } 	//Within class  
		  
		public static void main(String[] args) {  
		for (Season s : Season.values())				//printing all enum
		{  
		System.out.println(s);  
		}  
		//Array a[5]      a[3]
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of SPRING is: "+Season.valueOf("SPRING").ordinal());  
}
}