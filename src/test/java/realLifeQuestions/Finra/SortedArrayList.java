package realLifeQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;

/* Given a list of integers 1,2,3,4,5,6,...  sort the numbers */
public class SortedArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numList_2 = new ArrayList<>(Arrays.asList(899, 765, 1, 900, 123,2,73,9,101,11));

        sortList_3(numList_2);

//        Collections.sort(numList_2);    //Easiest way

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
