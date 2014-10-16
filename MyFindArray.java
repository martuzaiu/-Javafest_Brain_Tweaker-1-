package a.java.findarray;

import java.util.Arrays;

public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {

		int limit = array.length - subArray.length;

		for (int i = 0; i <= limit; i++) {
			int[] tmp = Arrays.copyOfRange(array, i, i + subArray.length);
			if (Arrays.equals(tmp, subArray))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		MyFindArray A = new MyFindArray();
		int[] largeArray = { 7, 8, 9 };
		int[] subArray = { 8, 9, 10 };

		System.out.println(A.findArray(largeArray, subArray));
	}

}
