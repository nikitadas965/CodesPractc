import java.util.Scanner;

public class leapYr {
	int year ;
	static boolean Leap(int year)
	{
		if(year<=0)
			return false;

		if(year%100==0)
		{
			if(year%400==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(year%4==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapYr l = new leapYr();
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		if(Leap(year))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
