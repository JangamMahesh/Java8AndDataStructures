package DS;

public class MaximumSumSubArray {
	public static void main(String[] args) {
		int[] nums= {2,1,-5,3,-1,2,9};
		int max=Integer.MIN_VALUE, sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			max=Math.max(max, sum);
		if(sum<0)
			sum=0;
		}
		System.out.println("max is "+ max);
	}
}
