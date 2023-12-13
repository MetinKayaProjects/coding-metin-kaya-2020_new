package codingbat.array_1;

import java.util.Arrays;

/*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
public class FrontPiece {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(frontPiece(new int[]{1, 2, 3}))));
        System.out.println((Arrays.toString(frontPiece(new int[]{1, 2}))));
        System.out.println((Arrays.toString(frontPiece(new int[]{1}))));
    }

    private static int[] frontPiece(int[] nums) {

        int[] newArr = new int[2];

        if (nums.length <= 1){
            newArr = nums;
        }else {
            newArr[0] = nums[0];
            newArr[1] = nums[1];
        }

        return newArr;
    }
}
