package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArrayList rev= new ReverseArrayList();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(new Integer(1));
		arr.add(new Integer(2));
		arr.add(new Integer(3));
		arr.add(new Integer(4));
		arr.add(new Integer(5));
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i)+" "); // before reversal
		}
		//arr=rev.reverseraay(arr); --- FUNCTION
		Collections.reverse(arr);   // ---- BY USING COLLECTIONS CLASS
		System.out.println();
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i)+" "); // after reversal
		}
	}

	public  ArrayList<Integer> reverseraay(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> revArr=new ArrayList<Integer>();
		for(int j=arr.size()-1;j>=0;j--)
		{
			revArr.add(arr.get(j));
		}
		return revArr;
	}

}
