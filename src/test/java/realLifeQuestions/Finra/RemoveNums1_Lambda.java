package realLifeQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Given a list of integers 1,2,3,4,5,6,... first sort the numbers and remove all values greater than 100 */
public class RemoveNums1_Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(123,2,333,43,545,73,9,101,11));

        System.out.println("nums = " + nums);

        Collections.sort(nums);
        System.out.println("nums (sorted) = " + nums);

        System.out.println("****************");
        ArrayList<Integer> numList_2 = new ArrayList<>(Arrays.asList(899, 765, 1, 900, 123,2,73,9,101,11));

        sortList_3(numList_2);
//
//        //sortNums-1
//
//        System.out.println("Before sort, nums = " + nums);
//        for (int i = 0; i < nums.size(); i++) {
//
//            for (int j = 0; j < nums.size(); j++) {  //i will stop by each numbers and compare with the previous one
//
//                if (nums.get(i) < nums.get(j)) {
//                    int temp = nums.get(i);
//                    nums.set(i, nums.get(j));
//                    nums.set(j, temp);
//                }
//            }
//        }
//        System.out.println("sortedNums---=  " + nums);

        //    1ST WAY: LAMBDA EXPRESSION ////////////////

        nums.removeIf(each -> each >= 100);

        System.out.println("nums after removing = " + nums);

    }

    public static void sortList_3(ArrayList<Integer> nums){

        System.out.println("Before sort, nums = " + nums);
        for (int i = 0; i < nums.size(); i++) {

            for (int j = 0; j < nums.size(); j++) {  //i will stop by each numbers and compare with the previous one

                if (nums.get(i) < nums.get(j)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        System.out.println("sortedNums---=  " + nums);
    }

}
