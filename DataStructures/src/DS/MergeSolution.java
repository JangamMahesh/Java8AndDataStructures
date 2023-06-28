package DS;

public class MergeSolution {

	
	    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int i=0;
	        int j=0;
	       
	        int k=0;
	        int[] result=new int[nums1.length];
	        for(int o=0;o<m+n;o++)
	        {
	            result[o]=nums1[o];
	        }
	        while(i<m && j<n)
	        {
	            if(result[i]<nums2[j])
	            {
	            	 System.out.println(i+" 1 "+j);
	                nums1[k]=result[i++];  
	               
	            }
	            else 
	            {
	            	 System.out.println(i+" 2  "+j);
	                nums1[k]=nums2[j++];    
	               
	            }
	           
	            k++;
	        }
	        while(i<m)
	        {
	        	System.out.println(i+" 3 "+j);
	            nums1[k++]=result[i++];
	            
	        }
	            while(j<n)
	            {
	            	 System.out.println(i+" 4  "+j);
	                 nums1[k++]=nums2[j++];  
	                
	            }
	        
	            return nums1;
	        
	    }
	
	public static void main(String[] args) {
		int[] nums1= {4,5,6,0,0,0};
		int[] nums2= {1,2,3};
		
		
		nums1=merge(nums1,3,nums2,3);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}
		
	}

}
