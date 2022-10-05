package javabasicoops;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

		public static void main(String args[]){  
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Sourabha");//Adding object in arraylist  
			list.add("Pooja");  
			list.add("Lahari");  
			list.add("Minaz");  
			//Traversing list through Iterator  
			Iterator<String> itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
		}

}
