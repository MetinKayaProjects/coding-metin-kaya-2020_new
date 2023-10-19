package practice;

import java.util.*;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */
public class TwoSumIndexes {

    public static void main(String[] args) {
        int[] nums1 =  {2,11,7,15};
        int[] nums2 =  {11,15,7,2};
        int[] nums3 =  {11,8, 15, 7,1, 2};
        int[] nums4 =  {11,8, 5, 15, 7,1, 2, 4};

        int target = 9;
//        int target = 10;
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//        System.out.println("twoSum(nums, target) = " + Arrays.toString(twoSum(nums1, target)));
        System.out.println("twoSum(nums, target) = " + Arrays.toString(twoSum(nums2, target)));
//        System.out.println("twoSum(nums, target) = " + Arrays.toString(twoSum(nums5, target)));
        System.out.println("*******************\n");
//        System.out.println("twoSumMAP(nums, target) = " + Arrays.toString(twoSumMap(nums1, target)));
//        System.out.println("twoSumMAP(nums, target) = " + Arrays.toString(twoSumMap(nums2, target)));
//        System.out.println("twoSumMAP(nums, target) = " + Arrays.toString(twoSumMap(nums3, target)));

        System.out.println("*******************\n");

//        System.out.println("twoSumMAP(nums, target) = " + (twoSumWithLIST(nums1, target)));
//        System.out.println("twoSumWithLIST: " + Arrays.toString( twoSumWithLIST(nums1, target)));
//        System.out.println("twoSumWithLIST: " + Arrays.toString( twoSumWithLIST(nums3, target)));
//        System.out.println("twoSumWithLIST: " + Arrays.toString( twoSumWithLIST(nums4, target)));

        int[] nums5 =  {2,5,5,11};
        int target2 = 10;
        //output [1,2]
        System.out.println("twoSumWithLIST: " + Arrays.toString( twoSumWithLIST(nums5, target2)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] =j;
                }
            }
        }
        Arrays.sort(index);

        return index;
    }

    public static int[] twoSumMap(int[] numbers, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), i };
            }
            numIndices.put(numbers[i], i);
        }

        throw new IllegalArgumentException("No two numbers add up to the target.");
    }

//    {2,11,7,15};
    public static int[] twoSumWithLIST(int[] nums, int target){
//    public static void twoSumWithLIST(int[] nums, int target){

        List<Integer> listOfSum = new ArrayList<>();
//        int[] indexes = new int[listOfSum.size()];

        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length ; j++) {
                if (i==j && nums[i] == nums[j]){
                    break;
                }else if (nums[i] + nums[j] == target) {
                    if (!listOfSum.contains(i) && !listOfSum.contains(j)) {
                        listOfSum.add(i);
                        listOfSum.add(j);
//                    indexes[i] = i;
//                    indexes[j] =j;
//
                    }
                }

            }
        }

//        System.out.println("listOfSum = " + listOfSum);
//        System.out.println("listOfSum.size = " + listOfSum.size());

        int[] indexes = new int[listOfSum.size()];
//        System.out.println("indexes.length = " + indexes.length);

        for (int m = 0; m < indexes.length; m++) {

            indexes[m] = listOfSum.get(m);
        }


//        System.out.println("indexes = " + Arrays.toString(indexes));


                return indexes;
    }

}
