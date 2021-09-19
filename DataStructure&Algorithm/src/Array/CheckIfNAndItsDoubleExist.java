package Array;

public class CheckIfNAndItsDoubleExist {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 5, 0 };

		System.out.println(checkIfExist(arr));
	}

	public static boolean checkIfExist(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == 2 * a[j] || a[j] == 2 * a[i]) {
					return true;
				}
			}
		}
		return false;
	}

}
