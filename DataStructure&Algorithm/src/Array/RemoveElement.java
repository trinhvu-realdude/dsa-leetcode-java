package Array;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		
		int n = removeElement(nums, val);
		System.out.println(n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeElement(int[] nums, int a) {
		int k = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != a) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

}
