package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReplaceNumWithNumsListInList {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//        nums.add(9);
//        nums.add(0);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        int num = 6;

//        List<Integer> nums2 = new ArrayList<>();
//        nums2.add(10);
//        nums2.add(15);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,15));

        replaveIndex(nums, num, nums2);
    }

    private static void replaveIndex(List<Integer> nums, int num, List<Integer> nums2) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)== num){
                nums.remove(nums.get(i));
                nums.addAll(nums2);
            }
        }
        System.out.println("nums = " + nums);
    }


    /*
    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(0);

        // Replace 6 with 10 and 15
        int indexToReplace = arrayList.indexOf(6);

        if (indexToReplace != -1) {
            arrayList.set(indexToReplace, 10);
            arrayList.add(indexToReplace + 1, 15);
        }

        // Print the modified ArrayList
        System.out.println(arrayList);



     */
}
