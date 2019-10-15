package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CheckingforaValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0)
		{
			
			String name=sc.nextLine();
			int phone=sc.nextInt();
			sc.nextLine();
			map.put(name, phone);
		}
		
		
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			if(map.containsKey(s))
			{
				System.out.println(map.get(s));
			}
			else {
                System.out.println("Not found");
            }
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
