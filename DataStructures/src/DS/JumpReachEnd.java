package DS;

// current position and how much it can jump
// if the current index more than reachable we can return false, since we cant reach to current index
//or else take which is max reachable point from current position.
public class JumpReachEnd {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 4 };
		System.out.println(isReachable(nums));
		
		// minimum no of steps to reach end
		System.out.println(minJumps(nums));
	}
	private static boolean isReachable(int[] nums) {
		int rechable = 0;
		for (int i = 0; i < nums.length; i++) {
			if (rechable < i) {
				return false;
			}
			rechable = Math.max(rechable, i + nums[i]);
		}
		return true;
	}
	
	static int minJumps(int[] arr){
        int maxReach=0;
        int current=0;
        int jump=0;
        if(arr[0]==0)
        return -1;
        if(arr.length<=0)
        return -1;
    
        for(int i=0;i<arr.length-1;i++)
        {
            maxReach=Math.max(maxReach,i+arr[i]);
            if(i==current)
            {
                current=maxReach;
                jump++;
            }
            
            // to check if no reachebilty 
            if(i>=maxReach)
            {
                return -1;
            }
            
        }
        
        return jump;
    }

}
