package codingbat.array_1;

import java.util.Arrays;

/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class PlusTWO {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9, 2}, new int[]{3, 4})));
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] newNums = new  int[4];
        newNums[0] = a[0];
        newNums[1] = a[1];
        newNums[2] = b[0];
        newNums[3] = b[1];

        return newNums;
    }
}
