package Array;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 2, 1 };

		System.out.println(thirdMax(arr));
	}

	public static int thirdMax(int[] arr) {
		int n = arr.length;
		int max = 0;

		for (int i = 0; i < n; i++) {
			max = i;
			
			for (int j = i+1; j < n; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			
		}
		return max;
	}

}
