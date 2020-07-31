package aa_Remember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDeclerations {
    public static void main(String[] args) {
        //  List Decleration
        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println("myList = " + myList);

        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList("a", "B", "Ali", "Ceyhan"));
        System.out.println("myList2 = " + myList2);

        String[] strArr = {"a", "b", "c", "d"};

        List<String> myList3 = new ArrayList<>();
        Collections.addAll(myList3, strArr);
        System.out.println("myList3 = " + myList3);

//        Collections.addAll(list2, strArray);

    }
}
