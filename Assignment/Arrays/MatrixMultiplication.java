package ArraysProgram;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] first_array= {{1,2},{3,4}};		
		int[][] second_array= {{5,6,7},{8,9,10}};
		int[][] result=new int[first_array.length][second_array[0].length];
		int sum=0;
		for(int first=0;first<first_array.length;first++)
		{
			for(int second=0;second<second_array[0].length;second++)
			{
				for(int k=0;k<first_array.length;k++)
				{
					sum+=first_array[first][k]*second_array[k][second];
				}
				result[first][second]=sum;
				sum=0;
			}
			
		}
		System.out.print(Arrays.deepToString(result));
								
								
		
		
		

	}

}
