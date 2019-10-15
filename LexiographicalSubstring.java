package Strings;

import java.util.Scanner;

public class LexiographicalSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(getSmallestAndLargest(s,k));

		
	}

	public static  String getSmallestAndLargest(String s, int k) {
		// TODO Auto-generated method stub
		if(s==" ")
		{
			System.out.println("error");
		}
		String curr = s.substring(0,k);
		String smallest=curr; // for comparison purposes
		String largest=curr;
		
		for(int i=k;i<s.length();i++)
		{
			curr = curr.substring(1,k)+s.charAt(i);
			
			if(largest.compareTo(curr)<0)
			{
				largest=curr;
			}
			if(smallest.compareTo(curr)>0)
			{
				smallest=curr;
			}
		}
		
		return smallest+ "\n"+ largest;
	}

}
