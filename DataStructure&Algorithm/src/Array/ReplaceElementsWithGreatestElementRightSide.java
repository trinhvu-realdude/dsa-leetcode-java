package Array;

public class ReplaceElementsWithGreatestElementRightSide {

	public static void main(String[] args) {
		int a[] = { 20, 15, 7, 8, 1, 3 };

		replaceElements(a);
	}

	public static void replaceElements(int[] a) {
		int n = a.length;

		for (int i = n - 1; i >= 0; i--) {
			if (i != n - 1) {
				a[i] = max(a[i], a[i + 1]);
			}
		}

		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}

		if (n > 0) {
			a[n - 1] = -1;
		}

		print(a);
	}

	public static int max(int i, int j) {
		if (i > j) {
			return i;
		}
		return j;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
