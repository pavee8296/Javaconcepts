package Java;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetS {
	public static void main(String args[]){  		  
		  
	HashSet<String> set=new HashSet<String>();  // hash function is used to we an store many data in the same index 
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ajay");  
		  set.add("Ravi");  
		  
	  
		  Iterator<String> itr1=set.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());
		 }  
		  
		  System.out.println("");
		  
			TreeSet<String> al=new TreeSet<String>();  
			  al.add("Ravi");  
			  al.add("Vijay");  
			  al.add("Ravi");  
			  al.add("Ajay");  
			    
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }
}
	
}