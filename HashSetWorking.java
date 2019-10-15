package Set;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h=new HashSet<>();
		h.add("India");
		 h.add("Australia"); 
	        h.add("South Africa"); 
	        h.add("India");// adding duplicate elements  , taking one
	        
	        
	        System.out.println(h); // display
	        System.out.println(h.contains("South Africa"));
	        
	        h.remove("Australia");
	        System.out.println(h);
	        
	        Iterator<String> itr= h.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next()); // next elements
	        }

	}

}
