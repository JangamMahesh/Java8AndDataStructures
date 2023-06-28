package binaryTree;


//every time calculate the mid such that every student allocated a book and find minimum possible value 
// by reducing or increasing the mid and return final value satisfying all conditions 
// each student must be taken 1 book, all the books need to allocated contagiously.
public class BookAllocation {

	public static void main(String[] args) {
		
		int[] arr= {12,34,67,90};
		int n=arr.length;
		int students=2;
		int minimumOfMaximumPages=findMinimumPages(arr,n,students);	
		System.out.println("minimum no of pages "+ minimumOfMaximumPages);

	}

	private static int findMinimumPages(int[] arr, int n, int students) {
		
		if(n<students)
		{
			return -1;
		}
		int low=Integer.MAX_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			low= low>arr[i]?arr[i]:low;
		}
		System.out.println("low "+ low);
		System.out.println("sum " +sum);
		int high=sum;
		int result=0;
		while(low<=high)
		{
			int mid=low +(high-low)/2;
			if(isDistributionPossible(mid,arr,students))
			{
				high=mid-1;
				
				result=mid;
			}
			else {
				low=mid+1;
			}
		}
		return result;
	}

	private static boolean isDistributionPossible(int mid, int[] arr, int students) {
		
		int pages=0;
		int numberStudentsAllocated=1;
		for (int i = 0; i < arr.length; i++) {
			
			if(pages+arr[i]>mid)
			{
				pages=arr[i];
				numberStudentsAllocated++;
			}
			else {
				pages+=arr[i];
			}
				
		}
		
		return numberStudentsAllocated==students;
	}

	
	}

	


