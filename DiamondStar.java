
public class DiamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upper half
		for(int i=1;i<=4;i++)
		{
			for(int  j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		for(int i=5;i>=0;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
	}

}
