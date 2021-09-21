package Array;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		
		int[] n = twoSum(arr, target);
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

	public static int[] twoSum(int[] a, int t) {
		int n = a.length;
		int k = 0;
		int z = 0;

		int v[] = new int[n];

		for (int i = 1; i < n; i++) {
			if (a[i] + a[i - 1] == t) {
				v[i] = i;
				v[i - 1] = i - 1;
				k++;
			}

			if (v[i] == i && v[i - 1] == i - 1) {
				a[z] = v[i - 1];
				a[z + 1] = v[i];
				z++;
			}
		}
		
		int output[] = new int[k+1];
		
		for (int i = 0; i < k+1; i++) {
			output[i] = a[i];
		}
		
		return output;
	}

}
