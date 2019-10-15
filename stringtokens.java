import java.util.Scanner;
import java.util.StringTokenizer;

public class stringtokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
	      //  String s = scan.nextLine();
		String s ="He is     a very very good    boy, isn't he?";
	      /*  // Write your code here.
	        String[] str=s.split("[^a-zA-Z]");
	        for(String word:str)
	        {
	        	System.out.println(word);
	        }*/
	       // scan.close();
	
		StringTokenizer st = new StringTokenizer(s);
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements())
		{
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
