
public class NumberPallindrome {

	static void  isPallindrome(int num)
	{
		if(num<0)
		{
			System.out.println("error");
		}
		int sum=0;
		int n=num;
		while(n!=0)
		{

			int a = n%10;
			sum = sum*10+a;
			n = n/10;

		}
		if(num==sum)
		{
			System.out.println("yes");

		}
		else
		{
			System.out.println("no");

		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPallindrome(120);
		isPallindrome(121);
		isPallindrome(-44);
		isPallindrome(1);
		isPallindrome(0);


	}

}
