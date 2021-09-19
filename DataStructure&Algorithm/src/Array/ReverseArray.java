package Array;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		
		a.add(4);
		a.add(4);
		a.add(3);
		a.add(2);
		
		System.out.println(reverseArray(a));
		
	}

	public static List<Integer> reverseArray(List<Integer> a) {
		List<Integer> v = new ArrayList<>();
		
		int n = a.size();
		
		for (int i = n-1; i >= 0; i--) {
			v.add(a.get(i));
		}
		
		return v;
	}
}
