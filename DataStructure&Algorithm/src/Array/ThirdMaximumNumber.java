package Array;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int arr[] = { 1,1,2 };

		System.out.println(thirdMax(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int thirdMax(int[] arr) {
		int n = arr.length;
		int k = 0;
		
//		if length < 3 return max
		if (n < 3) {
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] > arr[k]) {
					arr[k] = arr[i];
				}
			}
			return arr[0];
		}

//		selection sort
		for (int i = 0; i < n; i++) {
			int max = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			
//			swap
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			
			if (arr[k] != arr[i]) {
				k++;
				arr[k] = arr[i];
			}
		}
		
//		return third max
		if (arr[1] == arr[2]) {
			return arr[0];
		}
		return arr[2];
	}

}
