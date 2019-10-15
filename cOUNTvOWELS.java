import java.util.Scanner;

public class cOUNTvOWELS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// if 'i' replace with 'a'. if 'a' replace with 'i'
		
		String str="nikita@interview.com";
		
		String s[]=str.split("");
		
		
		for(int i=0;i<s.length;i++)
		{
			String ch=s[i];
			if(ch.equals("i"))
			{
				
				s[i]="a";
			}
			else if(ch.equals("a"))
			{
				
				s[i]="i";
			}
			
			
			
			
			
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}

		
		
		
		
	

	}

}
