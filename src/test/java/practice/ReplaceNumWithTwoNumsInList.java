package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
        Replace a num  with two nums in an arraylist. Example replace 6 with 10 and 15
        input: 1,2,3,4,5,6,7,8,9,0
        replace 6 with 10 and 15
        output: 1,2,3,4,5,10,15,7,8,9,0
        */
public class ReplaceNumWithTwoNumsInList {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
//        List<Integer> numList = new ArrayList<>(Arrays.asList(0, 3, 2, 7, 1, 6, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> numList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 6, 9, 0));
//        List<Integer> numList2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 6, 9));
        int oldNum = 6;
        int oldNum2 = 6;
//
        int newNum1 = 10;
        int newNum2 = 15;



        replaceNumWithTwoNums(numList, oldNum, newNum1, newNum2);
        replaceNumWithTwoNums(numList2, oldNum2, newNum1, newNum2);
    }

    private static void replaceNumWithTwoNums(List<Integer> nums1, int num1, int num2, int num3) {

//        int indexOfNum = nums1.indexOf(num1);
        for (int i = 0; i <nums1.size() ; i++) {
            if (nums1.get(i) == num1){
//                nums1.set(indexOfNum, num2);
//                nums1.add(indexOfNum + 1, num3);
                nums1.set(i, num2);
                nums1.add(i + 1, num3);
            }
        }
        System.out.println("numsList = " + nums1);
    }
}
