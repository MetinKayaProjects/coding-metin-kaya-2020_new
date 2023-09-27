package collections;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task - 2
• Create a method that will accept an ArrayList and sort the ArrayList into ascending order (small -> large).
Do not sure any ready sort method.
-> How will you do the opposite direction (l -> s)?
 */
public class SortArrayList_smallestNum {
    public static void main(String[] args) {

        try {
            ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 4, 5, -7, 2, 3, -1));
            findSmallest(list);
        }catch(Exception e) {
        System.exit(0);

        }

    }

    public static void findSmallest(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {  //i will stop by each numbers and compare with the previous one

                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        int smalest = list.get(0);
        int secondSmallest = list.get(1);

        System.out.println("smalest = " + smalest);
        System.out.println("secondSmallest = " + secondSmallest);
    }
}
