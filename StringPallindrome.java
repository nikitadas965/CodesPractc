
public class StringPallindrome {
	static void ispallindrome(String str)
	{
		String rev = "";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}

		if(str.equals(rev))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	
	static void reversewithoutmovingspaces(char[] ch)
	{
		
		
		int length=ch.length;
		int left=0;
		int right=length-1;
		while(left<right)
		{
			if(!Character.isAlphabetic(ch[left]))
			{
				left++;
			}
			else if(!Character.isAlphabetic(ch[right]))
			{
				right--;
			}
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ispallindrome("myuym");
		ispallindrome("madam");
		String str = "my name is nikita";
		char ch[] = str.toCharArray();
		reversewithoutmovingspaces(ch);
		String res= new String(ch);
		System.out.println(res);
	}

}
