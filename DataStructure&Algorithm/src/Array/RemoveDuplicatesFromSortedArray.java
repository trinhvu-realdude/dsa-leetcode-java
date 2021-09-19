package Array;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2 };

		int n = removeDuplicates(nums);

		System.out.println(n);

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		int k = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] != nums[k]) {
				k++;
				nums[k] = nums[i];
			}
		}
		return k + 1;
	}

}
