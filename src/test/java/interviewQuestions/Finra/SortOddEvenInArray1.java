package interviewQuestions.Finra;

import java.util.Arrays;

/*
•	There are some numbers in an array, put the odd ones at the beginning and even ones at the end
 */
public class SortOddEvenInArray1 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 12, 3, 11, 27, 6, 13, 1, 2};
        System.out.println("nums = " + Arrays.toString(nums));
        int i = 0;
        int j = nums.length-1;
        while(i < j ){
            if (nums[i] % 2 ==0){
                i++;
            }else if (nums[j] %2 ==1){
                j--;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums [j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));

    }
}
