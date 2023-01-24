package aa_Remember;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDeclerations {
    public static void main(String[] args) {
        //  List Decleration
        ArrayList<Object> myList = new ArrayList<Object>(Arrays.asList(1, 3, 7, "Ali", "Veli"));
        System.out.println("myList = " + myList);
        System.out.println("myList size = " + myList.size());

        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList("a", "B", "Ali", "Ceyhan"));
        System.out.println("myList2 = " + myList2);

        String[] strArr = {"a", "b", "c", "d"};
        List<String> myList3 = Arrays.asList(strArr);
        System.out.println("myList3 = " + myList3);
        //or
        List<String> myList4 = new ArrayList<>();
        Collections.addAll(myList4, strArr);
        System.out.println("myList4 = " + myList4);

//        Collections.addAll(list2, strArray);


        List<Integer> numList = new ArrayList<>();
        numList = Arrays.asList(1,4,55);
        System.out.println("numList = " + numList);

    }
}
