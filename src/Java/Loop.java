package Java;

public class Loop {
	public static void main(String[] args) {
		int i, j, k;
		j=0;
		k=0;
		
		for(i = 0; i<=5; i++) 			// i = i + 1 -> 1 + 1 =2
		{   System.out.println(i);	}
			
		while (j < 5)   				//while (Condition)
		{   System.out.println(j);			//{
			j = j + 1;	
		}									//}
		
		do  
		{   System.out.println(k);	
			k = k + 1;					
		}while (k <= 5);
	}
}