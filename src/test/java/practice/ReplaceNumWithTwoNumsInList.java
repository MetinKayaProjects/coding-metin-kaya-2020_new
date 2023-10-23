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
        int num1 = 6;
        int num2 = 10;
        int num3 = 15;



        replaceNumWithTwoNums(numList, num1, num2, num3);
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
        System.out.println("nums1 = " + nums1);
    }
}
