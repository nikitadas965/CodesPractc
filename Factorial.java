import java.util.Scanner;

public class Factorial {

	static int fact(int N)
	{
		if(N<=1)
		{
			return 1;
		}
		else
		{
			return N*fact(N-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fact(N));

		/*if(N<0)
		{
			System.out.println("error");
		}
		else
		{
			int i = 1; int fact=1;
			while(i<= N)
			{
				fact  = fact * i;
				i++;
			}

			System.out.print(fact);
		}	*/


	}
	

}
