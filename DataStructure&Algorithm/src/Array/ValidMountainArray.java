package Array;

public class ValidMountainArray {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 5 };

		System.out.println(validMountainArray(arr));
	}

	public static boolean validMountainArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int n = arr.length;

		if (n < 3) {
			return false;
		}

		while (i + 1 < n && arr[i] < arr[i + 1]) {
			i++;
		}
		System.out.println(i);

		while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
			j--;
		}
		System.out.println(j);

		if (i > 0 && j < n - 1 && i == j) {
			return true;
		}

		return false;
	}

}
