package conceptsjava;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("BUFFER METHOD");

		String name1 = "pavee";

		StringBuffer buffer = new StringBuffer();

		buffer.append(name1);
		
		System.out.println(buffer.reverse());
		
		
		System.out.println("\nNORMAL METHOD");

		String name = "pavithran";

		char[] array = name.toCharArray();

		String reversed = "";

		for (int i = array.length - 1; i >= 0; i--) {

			reversed += array[i];

		}

		System.out.println(reversed);
	}

}
