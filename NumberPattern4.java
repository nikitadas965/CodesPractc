
public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		// i starting from 1 but j starting from end
		
		for(int i= n-1;i>0;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	// both starting from n will print pattern like:
	// kam numbers jaha print krne hhai waha se i shuru hota hai
	//kaise print krne hai wo j btata hai
	
	/*
	 * 1
	 * 21
	 * 321
	 * 4321
	 * 
	 * **/

}
