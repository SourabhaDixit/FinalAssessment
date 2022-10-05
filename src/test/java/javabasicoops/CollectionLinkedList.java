package javabasicoops;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Sourabha");  
		al.add("Megha");  
		al.add("Maithri");  
		al.add("Ravi");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
