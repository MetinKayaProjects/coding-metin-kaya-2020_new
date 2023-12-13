package codingbat.array_1;

import java.util.Arrays;

/*
Given an array of ints of odd length,
look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
maxTriple([5, 1, 7, 9, 7, 8, 1]) → 9
 */
public class MaxTripple {
    public static void main(String[] args) {
        System.out.println((maxTriple(new int[]{1, 2, 3})));
        System.out.println((maxTriple(new int[]{1, 5, 3})));
        System.out.println((maxTriple(new int[]{5, 2, 3})));
        System.out.println((maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1})));
    }

    private static int maxTriple(int[] nums) {

        int max = Math.max(nums[0], nums[nums.length-1]);
        max = Math.max(max, nums[nums.length/2]);
//        Arrays.sort(nums);
//        max = nums[nums.length-1];

//        for (int num : nums) {
//            if (num > max) {
//                max = num;
//            }
//        }



        return max;
    }
}