import java.util.Scanner;

public class PrintUpperCaseCharFromAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int length = str.length();
		String result = "";
		
		for(int i=0;i<length;i++)
		{
			if(Character.isUpperCase(str.charAt(i)) ||  Character.isDigit(str.charAt(i)))
				
			{
				
				char ch = str.charAt(i);
				
				result = result + ch;
			}
		}
		System.out.println(result);
	}
}
