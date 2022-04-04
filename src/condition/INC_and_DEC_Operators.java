package condition;


public class INC_and_DEC_Operators {

	public static void main(String[] args) {

		int a = 15;

		a = a++ + ++a;
		
		System.out.println(a);

		/*
		 * a++ 15 will be stored in a++ and then the post increment will happen now the
		 * 
		 * value of a will be 16 now 
		 * 
		 * ++a will take the post incremented value of 15 that is 16 now  and pre incremnt it before storing the value i.e 17 
		 * 
		 *  a = 15 +17
		 */

	

		int b = 15;

		b = ++b + ++b;
		
		System.out.println(b); 
		
		/*
		 * ++b will pre incremnt the value of 15 and store it as 16
		 * 
		 * value of b will be 16 now 
		 * 
		 * ++b will take the post incremented value of 15 that is 16 now and pre incremnt it before storing the value i.e 17 
		 * 
		 *  b = 16 +17
		 */
		
		int c = 15;

		c = ++c + c++;
		
		System.out.println(c);

		
	}
}
