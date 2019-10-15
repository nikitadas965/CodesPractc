import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		//upper half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		// lower half
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
