package ab_collections_concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        list.add(0, "0");  //0 int degil, String!!!!

        System.out.println("list = " + list);  //list = [0, a, b, c, c, null]   buradaki 0 int degil, String

       ArrayList<String> list2= new java.util.ArrayList<String>(Arrays.asList("Ali", "x", "y"));
       System.out.println("list2 = " + list2); //list2 = [Ali, x, y]

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,5,1,87,45,101,20));
        System.out.println("numbers = " + numbers);



//SORT SORT SORT

        Collections.sort(numbers);
        System.out.println("numbersSorted = " + numbers);


//        hatirlatma (Arrays)
        int[] nums = new int[2];
        nums[0] = 2;
        nums[1]=3;

        int[] nums2 = {2,4,4,1};

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        Arrays.sort(nums2);
        System.out.println("sorted nums2: " + Arrays.toString(nums2));
    }
}
