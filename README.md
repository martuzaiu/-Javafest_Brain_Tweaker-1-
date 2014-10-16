-Javafest_Brain_Tweaker-1-
==========================

Find an Array

Implement a method that given two arrays as parameters will find the starting index where the second parameter occurs as a sub-array in the array given as the first parameter.

Your implementations should return -1 if the sub-array cannot be found.

Your implementation must implement the FindArray interface given bellow:

public interface FindArray {
int findArray(int[] array, int[] subArray);
}

Sample Input:

[4,9,3,7,8] and [3,7] should return 2.
[1,3,5] and [1] should return 0.
[7,8,9] and [8,9,10] should return -1.

Sample Code :

public class MyFindArray implements FindArray {
public int findArray(int[] array, int[] subArray) {
return -1;
}
}
