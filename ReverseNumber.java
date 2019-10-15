import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int result=0;
boolean gfg;	
while(num!=0)
{
	int a = num%10;
	result= (result*10)+a;
	num=num/10;
}
System.out.println(result);

	}

}
