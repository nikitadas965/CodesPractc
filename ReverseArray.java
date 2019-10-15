import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[] = new int[size];
		int temp;
	
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
				
		}
		int right=arr.length-1;
		int left=0;
		while(left<right)
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			right--;
			left++;
			
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}