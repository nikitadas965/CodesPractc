package ArrayList;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		ArrayList<ArrayList<Integer>> arrList= new ArrayList<ArrayList<Integer>>(n); // main list
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		arrList.add(a1);

		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(4);
		a2.add(5);
		arrList.add(a2);

		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(8);
		a3.add(9);
		
		arrList.add(a3);

		for(int i=0;i<arrList.size();i++)
		{
			for(int j=0;j<arrList.get(i).size();j++)
			{
				System.out.print(arrList.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
