package JavaSimplePrograms;

import java.util.Scanner;

public class Average {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		int arr[] = {5,4,3,2,1};
		int count=0, sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+i;
			count++;
		}
		
		
		int avg = sum/count;
		System.out.println(avg);
		*/
		Scanner sc = new Scanner(System.in);
		int num,sum=0,count=0,numbers;
		System.out.println("how many numbers?");
		num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.print("\tEnter number" + i + " \t");
			   numbers = sc.nextInt();
			sum= sum+numbers;
			count++;
		}
		int avg = sum/count;
		System.out.println(avg);
	}

		
		
	

}
