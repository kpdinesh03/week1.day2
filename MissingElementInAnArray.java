package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,5}; 
		int n=0,sum=0, sum1=0, miss;
		n=arr[arr.length-1];
		sum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		miss=sum-sum1;
		if(miss==0)
		{
			System.out.println("All numbers are present");
		}
		else
		{
			System.out.println("The missing number is "+miss);
		}
	}

}
