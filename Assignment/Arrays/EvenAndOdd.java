package ArraysProgram;

import java.util.Arrays;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7};
		Arrays.sort(array);
		int length=array.length;
		int mid=length%2!=0?length/2:(length)/2-1;
		int right=mid+1,left=mid;
		
		while(left>=0&&right<length)
		{
			System.out.print(array[left--]+","+array[right++]);
			if(right<length)
				System.out.print(",");
		}
		if(left==0)
		{
			System.out.print(","+array[left]);
		}
		
			
	}

}
