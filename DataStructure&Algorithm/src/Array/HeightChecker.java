package Array;

public class HeightChecker {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(heightChecker(arr));
	}

	public static int heightChecker(int[] height) {
		int n = height.length;
		
//		new array to compare with sorted array
		int expected[] = new int[n];

		for (int i = 0; i < n; i++) {
			expected[i] = height[i];
		}

//		selection sort
		for (int i = 0; i < n; i++) {
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (height[j] < height[min]) {
					min = j;
				}
			}

			int temp = height[min];
			height[min] = height[i];
			height[i] = temp;
		}

//		compare and find wrong index
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (expected[i] != height[i]) {
				count++;
			}
		}

		return count;
	}

}
