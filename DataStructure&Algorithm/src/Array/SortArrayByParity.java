package Array;

public class SortArrayByParity {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4 };

		sortArrayByParity(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortArrayByParity(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				k++;
			}
		}
	}
}
