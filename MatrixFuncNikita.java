import java.util.Arrays;

public class MatrixFuncNikita {

	public static void main(String[] args) {
		// TODO Auto-generated method st ub
		
		int [] [] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		for(int i =0;i<4;i++) // row
		{
			for(int j=0;j<4;j++) //column
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		/*  int R = 2; 
	        int C = 5; 
	        int a[][] = { {1,  2,  3,  4,  5,  6}, 
	                      {7,  8,  9,  10, 11, 12}, 
	                      {13, 14, 15, 16, 17, 18} 
	                    }; 
	        spiralPrint(R,C,a); */
		
		
		spiralPrint(arr);		
	}
	//Prints the output:1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
	private static void spiralPrint( int arr[][]) {
		// TODO Auto-generated method stub
		int end_row_index=0; int end_col_index=0;
		int i,start_row_index=0,start_col_index=0;
		while(start_row_index<end_row_index)
		{
			  /*  k - starting row index 
	        m - ending row index 
	        l - starting column index 
	        n - ending column index 
	        i - iterator 
	        
	         
	        */
			//print the first row from the remaining rows
			for(i=start_col_index;i<end_col_index;++i)
			{
				
				System.out.println(arr[start_row_index][i]);
			}
			start_row_index++;
			
			//print the last column
			for(i=start_row_index;i<end_row_index;++i)
			{
				System.out.println(arr[i][end_col_index]);
			}
			end_col_index--;
			
		     // Print the last row from the remaining rows */ 
         
         
          

            if(start_row_index<end_row_index)
            {
			//print the last row
			for(i=end_col_index-1;i>=start_col_index;--i)
			{
				System.out.println(arr[i][start_col_index]);
			}
			end_row_index--;
            }
            // Print the first column from the remaining columns */ 
            if(start_col_index<end_col_index)
            {
            	for(i=end_row_index;i>= start_row_index; --i)
            	{
            		System.out.println(arr[i][start_col_index]);
            	}
            	start_col_index++;
            	
            }
		}
			
		
		
	}

}
