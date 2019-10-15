import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str= {"A","B","C","A","B","A"};
		int count=0;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String elements : str) // traversing over the array
		{
			
			if(map.containsKey(elements))
			{
			
				
				System.out.println("duplicate found: " + elements);
				
			
			
			}
			else
				map.put(elements,1);
		}
		
	}

}
