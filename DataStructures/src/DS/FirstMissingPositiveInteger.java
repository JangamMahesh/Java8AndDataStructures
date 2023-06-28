package DS;

// make a diff number like max of length for which are less than 0 and more than length
//since missing number should be between 1 to n+1
//loop take the current index element and put that place with negative of it by -1 to get the index of current element
// then loop if any index number is positive return next index since index starts from 0;
public class FirstMissingPositiveInteger {

	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] <= 0 || nums[i] > n) {
				nums[i] = n + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			int id = Math.abs(nums[i]);
			if (id > n)
				continue;
			id--;
			if (nums[id] > 0)
				nums[id] = -nums[id];

		}
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0)
				return i + 1;
		}
		return n + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstMissingPositive(new int[] { 1, 2, 0 }));
	}

}
