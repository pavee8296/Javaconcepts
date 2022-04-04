package Java;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashS {
public static void main(String args[]){
HashMap<Integer,String> hm=new HashMap<Integer,String>();    
   hm.put(1,"Venkatesh");    
   hm.put(2,"Indramohan");   
   
   for(Map.Entry m : hm.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }
   
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
   ht.put(1,"Venkatesh");  
   ht.put(2,"Indramohan");
   
   for(Map.Entry m : ht.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
}
}
