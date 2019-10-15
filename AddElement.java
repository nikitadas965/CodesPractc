import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter index");
		int index=sc.nextInt();
		System.out.println("enter number");
		int number =sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("add elements in array");
			arr[i]=sc.nextInt();
				
		}
		for(int i=0;i<index;i++)
		{
			arr[i]=arr[i+1];                                    
		}
		arr[index]=number;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
