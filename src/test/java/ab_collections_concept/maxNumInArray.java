package ab_collections_concept;


import java.util.Arrays;

public class maxNumInArray {
    public static void main(String[] args) {
        int [] numbers = {15, 3, 6, 1, 30, 21, 4};
//        int [] numbers = new int[] {15, 3, 6, 1, 30, 21, 4};

        System.out.println("max number in the array-1: " + maxNum1(numbers));
        System.out.println("max number in the array-2: " + maxNum2(numbers));
        System.out.println("max number in the array-3: " + maxNum3(numbers));
        System.out.println("max number in the array-4: " + maxNumWithSortMethod(numbers));
        System.out.println("max number in the array-5: " + maxNumWitLoopSort(numbers));
    }

    public static int maxNum1(int[] nums){
//        int maxNum = nums[0];
        int maxNum = Arrays.stream(nums).max().getAsInt();
        return maxNum;
    }

    public static int maxNum2(int[] nums){

        int maxNum = nums[0];

        for (int num : nums) {
            maxNum = (num > maxNum) ? num : maxNum;
        }
        return maxNum;
    }

    public static int maxNum3(int[] nums){
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum){
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static int maxNumWithSortMethod(int[] nums){
        int maxNum = 0;
        Arrays.sort(nums);
        maxNum = nums[nums.length-1];

        return maxNum;
    }

    public static int maxNumWitLoopSort(int[] nums){

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {     //{15, 3, 6, 1, 30, 21, 4}
            for (int j = 0; j < nums.length; j++) { //{15, 3, 6, 1, 30, 21, 4}
                if (nums[i] < nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
//            System.out.println("nums = " + Arrays.toString(nums));
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return nums[nums.length-1];
    }

}
