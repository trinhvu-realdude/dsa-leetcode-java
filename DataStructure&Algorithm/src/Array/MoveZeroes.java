package Array;

public class MoveZeroes {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 12 };

		moveZeroes(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void moveZeroes(int[] a) {
		int k = 0;
		int n = a.length;
		
//		if length > 1 -> for loop, using k pointer with indexes in array
		if (n > 1) {
			for (int i = 0; i < n; i++) {
//				replace elements to head of array if elements != 0
				if (a[i] != 0) {
					a[k] = a[i];
					k++;
				}
			}
			
//			elements == 0, replace to the end
			for (int i = k; i < n; i++) {
				a[k] = 0;
				k++;
			}
		}
	}
}
