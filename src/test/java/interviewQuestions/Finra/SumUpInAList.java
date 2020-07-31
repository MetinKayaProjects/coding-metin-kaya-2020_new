package interviewQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;

//Write a method; argumants an integer list (or array) and an int num.
// print them out if sum up of two nums in this list is equals to the num
public class SumUpInAList {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        sumUpTwoNums(nums, 6);
        System.out.println("**************");
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        sumUpTwoNums2(numsList, 6);
    }
//1st way: Array
    public static void sumUpTwoNums(int[] nums, int num) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == num) {
                    System.out.println("[nums[i] + nums[j] ]= num = " + num + " = " + nums[i] + " + " + nums[j]);
                }
            }
        }

    }
    //2nd way: ArrayList
    public static void sumUpTwoNums2(ArrayList<Integer> nums, int num){
        int sum = 0;
        for (int i= 0; i < nums.size(); i++){
            for (int j = i+1; j < nums.size(); j++){
                sum = nums.get(i) + nums.get(j);
                if (sum == num){
                    System.out.println("[nums.get(i) + nums.get(j)] = num = "+ num + " = "  + nums.get(i) + " +  " + nums.get(j));
                }
            }
        }
    }

}
