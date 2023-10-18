package collections;

import java.util.*;

/*
Task - 2
• Create a method that will accept an ArrayList and sort the ArrayList into ascending order (small -> large).
Do not sure any ready sort method.
-> How will you do the opposite direction (l -> s)?
 */
public class SortArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 4, 5, 2, 3, 1));

        sortList2(list);
        System.out.println("********************");
        sortList_3(list);

    }
    public static void sortList2(ArrayList<Integer> list){

        int[] arr = new int[list.size()];

        for (int i=0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        System.out.println("Before sort = " + Arrays.toString(arr));  //[1, 4, 4, 5, 2, 3, 1]

        Arrays.sort(arr);
        System.out.println("After sort = " + Arrays.toString(arr));  //[1, 1, 2, 3, 4, 4, 5]

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
