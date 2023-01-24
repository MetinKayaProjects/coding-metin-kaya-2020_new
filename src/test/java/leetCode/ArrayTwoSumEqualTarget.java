package leetCode;

// Question: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//
//  You may assume that each input would have exactly one solution,
//  and you may not use the same element twice.
//
//You can return the answer in any order.

//Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]


import java.util.Arrays;

public class ArrayTwoSumEqualTarget {
//    public static int[] twoSum(int[] nums, int target) {
//        int[] outputs = new int[2];
//        for (int i = 0; i < nums.length-1 ; i++) {
//            if (nums[i] + nums[i+1] == target){
//                outputs[0] = i;
//                outputs[1] = i+1;
//            }
//        }
//
//        return outputs;
//    }

    public static int[] twoSum(int[] nums, int target){
        int[] outputs = new int[2];
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    outputs[0] = i;
                    outputs[1] = j;
                }
            }

        }
        return outputs;
    }

    public static void main(String[] args) {
//        int[] nums = {3,3};
//        int target = 6;
//        Output: [0,1]

        int[] nums = {3,2,4}; int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
//        System.out.println(twoSum(nums, target));
    }
}
