import java.util.Scanner;

public class PrimeNumber {
	static boolean isprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;

	}

	public	static void getAllPrimeNumbers(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println(isprime(2));
		System.out.println(isprime(33));*/
		getAllPrimeNumbers(100);


	}
}
