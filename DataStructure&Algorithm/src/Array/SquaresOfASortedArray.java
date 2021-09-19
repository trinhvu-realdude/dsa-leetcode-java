package Array;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };

		sortedSquares(arr);
	}

	public static void sortedSquares(int[] arr) {
		int n = arr.length;
		int v[] = new int[n];

		int i = -1;
		while ((i + 1) < n && arr[i + 1] < 0) {
			i++;
		}

		int j = n;
		while ((j - 1) >= 0 && arr[j - 1] >= 0) {
			j--;
		}

		int k = 0;
		while (i >= 0 || j < n) {

			if (i >= 0 && j < n) {
				int ii = arr[i] * arr[i];
				int jj = arr[j] * arr[j];
				if (ii < jj) {
					v[k] = ii;
					i--;
					k++;
				} else {
					v[k] = jj;
					j++;
					k++;
				}
			} else if (i >= 0) {
				v[k] = arr[i] * arr[i];
				i--;
				k++;
			} else {
				v[k] = arr[j] * arr[j];
				j++;
				k++;
			}
		}

		for (int z = 0; z < v.length; z++) {
			System.out.print(v[z] + " ");
		}
		System.out.println();
	}
}
