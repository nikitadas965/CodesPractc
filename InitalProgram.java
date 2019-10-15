package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InitalProgram {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        

	        ArrayList<Integer>list=new ArrayList<Integer>(n);
	        int insertindex=sc.nextInt();
	        int element=sc.nextInt();
	        int query=sc.nextInt();
	        for(int i=0;i<=n;i++)
	        {
	       
	            list.add(insertindex,element);
	        }
	int removeindex=sc.nextInt();
	list.remove(removeindex);

	}

}
