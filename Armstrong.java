package JavaSimplePrograms;

import java.util.Scanner;

public class Armstrong {

	/*public static void main(String[] args) {*/
	// TODO Auto-generated method stub
	/* Scanner sc=new Scanner(System.in);
		    int test=sc.nextInt();
		    while(test-->0)
		    {
		    	  int num=sc.nextInt();
		    	 // int num2=sc.nextInt();
				    int sum=0;
				    int temp=num;
		        while(temp!=0)
		        {
		            int a=temp%10;
		            sum=sum+a;
		            temp=temp/10;
		        }
		     StringBuilder sb = new StringBuilder();
		     String str=Integer.toString(sum);
		     sb.append(str);
		     String revStr=sb.reverse().toString();
		     if(revStr.equals(str))
		     {
		    	 System.out.println("YES");
		     }
		     else
		     {
		    	 System.out.println("NO");
		     }
		    }*/

	/*Scanner sc= new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0)
		{
		    long num= sc.nextLong();
		    long rev=0;
		    while(num!=0)
		    {
		        rev=rev*10+num%10;
		        num=num/10;
		    }
		    System.out.println(rev);
		}*/
	static boolean prime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main (String[] args) 
	{
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int num=sc.nextInt();
			if(prime(num))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}

