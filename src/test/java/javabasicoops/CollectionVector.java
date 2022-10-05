package javabasicoops;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Sourabha");  
		v.add("Kousthubha");  
		v.add("Shalini");  
		v.add("Ganesh");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}
	}

}
