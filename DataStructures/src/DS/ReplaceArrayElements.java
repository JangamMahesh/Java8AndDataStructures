package DS;

// if found max right element than current element replace it with max right element or else -1
// we know for last element we dont have other one so make it -1
// come from right if we found less element than maxright replace it with max right or else -1
// update right max if we find current element more than this
public class ReplaceArrayElements {

	public static void main(String[] args) {

		int[] arr= {7,8,9,11,6,1,7,6};
		
		int size=arr.length;
		int rightMax=arr[size-1];
		arr[size-1]=-1;
		// leave last element 
		for(int i=size-2;i>=0;i--)
		{
			int temp=arr[i];
			if(temp<rightMax)
			{
				arr[i]=rightMax;
			}
			else
			{
				arr[i]=-1;
			}
			if(temp>rightMax)
			{
				rightMax=temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
