package Array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int nums[] = { 1, 0, 1, 1, 0, 1 };

		int n = findMaxConsecutiveOnes(nums);

		System.out.println(n);
	}

	private static int findMaxConsecutiveOnes(int[] nums) {

		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count = 0;
			} else {
				count++;
				if (count > max) {
					max = count;
				}
			}
		}
		return max;
	}

}
