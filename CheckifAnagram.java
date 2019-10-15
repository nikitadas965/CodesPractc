package JavaSimplePrograms;

import java.util.Arrays;
/** Anagram are 2 strings which has the same letters not arranged in the same order. Like abcd and bacd**/
public class CheckifAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char str1[]= {'a','b','c','d'};
char str2[]= {'b','a','d','c'};

if(checkAnagram(str1, str2))
{
	System.out.println("is anagram");
}
else
{
	System.out.println("not anagram");
}
	}
	static boolean checkAnagram(char[] str1, char[] str2)
	{
		int n1=str1.length; // taking length
		int n2=str2.length;

		if(n1!=n2)
		{
			return false; // if length is not same, it cannot be anagram
		}
		else
		{
			Arrays.sort(str1);
			Arrays.sort(str2);


			for(int i=0;i<n1;i++)
			{
				if(str1[i] != str2[i]) // comparing the values
				{
					return false;
				}
		
			}
		}
		return true;


	}
}
