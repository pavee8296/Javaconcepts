package Java;

import java.util.*;
class Main{
public static void main(String args[]){
 
ArrayList al=new ArrayList();  // creating array list
al.add("Jack");                // adding elements    
al.add("Tyler");
Iterator itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}