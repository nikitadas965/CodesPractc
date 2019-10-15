package Map;

import java.util.HashMap;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("first", "FIRST");
		map.put("second", "SECOND");
		System.out.println("value of 2nd key"+ map.get("second"));
		System.out.println(map.isEmpty());
		map.remove("second");
		System.out.println(map);
		System.out.println(map.size());

	}

}
