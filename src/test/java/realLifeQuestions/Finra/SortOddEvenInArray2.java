package realLifeQuestions.Finra;

import java.util.Arrays;

/*
•	There are some numbers in an array, put the odd ones at the beginning and even ones at the end
 */
public class SortOddEvenInArray2 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 12, 3, 11, 27, 6, 13, 1, 2};
        System.out.println("nums = " + Arrays.toString(nums));

        int j = -1;
        int temp;

        // quick sort method                        //i    0  1   2   3   4   5   6  7  8
        for (int i = 0; i < nums.length; i++) {  //nums = [4, 12, 3, 11, 27,  6, 13, 1, 2]
                                                //  j=-1   0  1               2         3
                                                // nums = [4, 12, 6,  2, 27,  3, 13, 1, 11]

            // if array of element
            // is odd then swap
            if (nums[i] % 2 == 0) {

                // increment j by one
                j++;

                // swap the element
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
