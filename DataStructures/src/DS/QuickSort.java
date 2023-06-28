package DS;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr= {5,2,4,7,1,8,2};
		int[] arr1=quickSort(arr,0,arr.length-1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		

	}

	private static int[] quickSort(int[] arr, int low, int high) {

		if(low<high)
		{
			int pivote=partition(arr,low,high);
			System.out.println(pivote);
			quickSort(arr,low,pivote-1);
			quickSort(arr,pivote+1,high);
		}
		
		return arr;
	}

	private static int partition(int[] arr, int low, int high) {

		int pivote=arr[high];
		int k=low;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=pivote)
			{
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
		}
		int temp=arr[k];
		arr[k]=arr[high];
		arr[high]=temp;
		
		return k;
	}

}
