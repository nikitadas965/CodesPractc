import java.util.Scanner;

public class DNA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String DNA = in.next();
	    int length = DNA.length();
	  
	    StringBuilder sb = new StringBuilder();
	    for(int i=length-1;i>=0;i--)
	    {
//	  sb.append(DNA.charAt(i)); NORMAL Reversal
	    	if(DNA.charAt(i)=='A')
	    	{
	    		sb.append('T');
	    	}
	    	else if(DNA.charAt(i)=='C')
	    	{
	    		sb.append('G');
	    	}
	    	else if(DNA.charAt(i)=='G')
	    	{
	    		sb.append('C');
	    	}
	    	else if(DNA.charAt(i)=='T')
	    	{
	    		sb.append('A');
	    	}
	    }
	    System.out.println(sb);
	    	

	}
	
}
