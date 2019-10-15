import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class NIKITA {

	public static void main(String[] args) {
		/*
		String str[]=s.split("");
		int length=0;
		TreeSet<String> tmap=new TreeSet<String>();
		for(int i=0;i<str.length;i++)
		{
			tmap.add(str[i]);
		}

	 
		length=tmap.size();
		System.out.println(length);
		*/
		String s="pwwkew";
		 int ret = 0;
		    Map<Character, Integer> map = new HashMap<>();
		    for (int i = 0, start = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if (map.containsKey(c)) 
		            start = Math.max(map.get(c)+1, start);
		        ret = Math.max(ret, i-start+1); 
		        map.put(c, i);
		    }
		  System.out.println(ret);

	}
}


