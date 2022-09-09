package ArraysProgram;

import java.util.Arrays;
import java.util.Comparator;

public class WieghtageSum {

	public static void main(String[] args) {
		int arr[]= {49,36,8,10,12};
		int weight[][] = new int[arr.length][2];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int  sqrt=(int)Math.sqrt(arr[i]);
			int perfectNumber=sqrt*sqrt;
			if(arr[i]==perfectNumber)
				sum+=5;
			if(arr[i]%6==0 && arr[i]%4==0)
				sum+=4;
			if(arr[i]%2==0)
				sum+=3;
			
		weight[i][0]=arr[i];
		weight[i][1]=sum;
		}
		for(int i=0;i<weight.length;i++)
		{
			for(int j=i+1;j<weight.length;j++)
			{
				if(weight[i][1]<weight[j][1])
				{
					int temp=weight[i][0];// 0th index of array
					weight[i][0]=weight[j][0];
					weight[j][0]=temp;
					
					temp=weight[i][1];//1 st index of array
					weight[i][1]=weight[j][1];
					weight[j][1]=temp;
				}
			}
		}
     System.out.println(Arrays.deepToString(weight)); 
	}
	
	

}
