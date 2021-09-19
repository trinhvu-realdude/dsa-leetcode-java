package Array;

import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappearedNumbers(arr);
	}

	private static void findDisappearedNumbers(int[] a) {
		int k = 0;
		int n = a.length;
		for (int i = n-1; i >= 0; i--) {
			if (a[i] < a[k]) {
				a[k] = a[i];
				k++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
