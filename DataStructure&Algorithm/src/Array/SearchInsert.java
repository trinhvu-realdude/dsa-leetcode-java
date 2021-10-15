package Array;

public class SearchInsert {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 6 };
		int target = 2;

		int n = searchInsert(nums, target);
		System.out.println(n);
	}

	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		if (target < nums[0]) {
			return 0;
		}
		if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		int j = -1;
		while (nums[j + 1] < target) {
			j++;
		}
		return j + 1;
	}
}
