package Array;

public class FindNumbersWithEvenNumOfDigits {

	public static void main(String[] args) {
		int nums[] = { 555, 901, 482, 1771 };

		int n = findNumbers(nums);

		System.out.println(n);
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (countNumOfDigit(nums[i]) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int countNumOfDigit(int i) {
		int count = 0;
		while (i != 0) {
			i = i / 10;
			count++;
		}
		return count;
	}

}
