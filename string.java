import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		int n=3 ; int m=size+5; // n=rows , m = cols
		int i, j; 
		for (i = 1; i <= n; i++) 
		{ 
			for (j = 1; j <= m; j++) 
			{ 
				if (i == 1 || i == n ||  
						j == 1 || j == m)             
					System.out.print("*");             
				else
				{
					System.out.print(str+"*"); 
					break;
					
				}
			
				
			} 
			System.out.println(); 
		} */
		
		HashMap<Integer,String> ts= new HashMap<>();
		ts.put(1,"abc");
		ts.put(2,"def");
		ts.put(3,"acb");
	
		System.out.println(ts.size());
	}



}


