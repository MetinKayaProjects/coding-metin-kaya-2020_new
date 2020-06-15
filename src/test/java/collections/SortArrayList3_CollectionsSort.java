package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList3_CollectionsSort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 4, 5, 2, 3, 1));

        System.out.println("list = " + list);

        Collections.sort(list);

        System.out.println("sortedList = " + list);
    }
}
