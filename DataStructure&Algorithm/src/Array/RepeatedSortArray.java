package Array;

public class RepeatedSortArray {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		System.out.println(sortArray(arr));
	}

	public static int sortArray(int[] arr) {
		int k = 1;
		int n = arr.length;
		
		if (n < 0) {
			return 0;
		}

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		return k;
	}

}
