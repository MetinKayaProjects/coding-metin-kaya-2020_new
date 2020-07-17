package stringsAndLoops;

import java.util.Arrays;

/*
Write a method that can add number into array under specific position.
(Exp: [12, 1, 4, 123, 14] -> [12, 5, 1, 4, 123, 14]
 */
public class AddNumIntoArray {
    public static void main(String[] args) {
        int array[] = {12,1,4, 123, 14};
//        System.out.println(Arrays.toString(array));// [12, 1, 4, 123, 14]
        addNumToArray(array, 5, 1);   //[12, 5, 1, 4, 123, 14]


    }

    public static void addNumToArray(int[] nums, int num, int position) {
        int[] newNums = new int[nums.length+1];

        for (int i = 0, j = 0; i < newNums.length; i++) {
            if (i == position) {
                newNums[i] = num;
            } else {
                newNums[i] = nums[j];
                j++;
            }
        }
        System.out.println("newNums = " + Arrays.toString(newNums));
    }

}
