import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> map= new HashMap<>();
		map.put(null, null);
		map.put(null, 5);
		map.put(3, null);
		map.put(4, 1);
		map.put(5, 1);
		map.put(3, 1);

		for(Entry<Integer, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	/*	for(Integer entry: map.keySet())
		{
			System.out.println(entry);
		}*/
		//using java 8
		//map.forEach((key,value) -> System.out.println(key + " = " + value));
		
		
		//////////////////////////
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		
		
	}

}
