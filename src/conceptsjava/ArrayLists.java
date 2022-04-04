package conceptsjava;
import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] fruits = new String [3];
		fruits[0]= "1.apple";
		fruits[1]= "2.mango";
		fruits[2]= "3.banana";
		
		System.out.println(fruits[0]);
		
		ArrayList fruitlist = new ArrayList();
		fruitlist.add("1.apple");
		fruitlist.add("2.mango");
		fruitlist.add("3.orange");
		
		System.out.println(fruitlist);
	}

}