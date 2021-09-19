package Array;

public class MoveZeroes {
	public static void main(String[] args) {
		int arr[] = { 1, 0 };

		moveZeroes(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void moveZeroes(int[] a) {
		int k = 0;
		int n = a.length;

		if (n > 1) {
			for (int i = 0; i < n; i++) {
				if (a[i] != 0) {
					a[k] = a[i];
					k++;
				}
			}

			for (int i = k; i < n; i++) {
				a[k] = 0;
				k++;
			}
		}
	}
}
