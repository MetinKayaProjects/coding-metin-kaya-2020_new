package stringsAndLoops;

import java.util.Arrays;

public class ArraysSortWithoutSortMethod {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 3, 5, 1};
//        nums[0] = 12;
//        nums[1] = 3;
//        nums[2] = 5;
//        nums[3] = 1;
        System.out.println("nums = " + Arrays.toString(nums));

        sortedArray(nums);


    }
    public static void sortedArray(int[] nums){

        for (int i=0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("sortedNums = " + Arrays.toString(nums));
    }
}
