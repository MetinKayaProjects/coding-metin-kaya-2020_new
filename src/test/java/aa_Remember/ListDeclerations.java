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

        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList("a", "B", "Ali", "Ceyhan"));
        System.out.println("myList2 = " + myList2);


        String[] strArr = {"a", "b", "c", "d"};
        List<String> myList3 = Arrays.asList(strArr);
//        List<Object> myList3 = Arrays.asList(strArr);
        System.out.println("myList3 = " + myList3);

        //or

        List<String> myList4 = new ArrayList<>();
        Collections.addAll(myList4, strArr);
        System.out.println("myList4 = " + myList4);

//        Collections.addAll(list2, strArray);


        List<Integer> numList_1 = new ArrayList<>();
        numList_1 = Arrays.asList(1,4,55);
        System.out.println("numList_1 = " + numList_1);


        List<Integer> numList = Arrays.asList(1,4,55);
        System.out.println("numList = " + numList);

        System.out.println("****************\n");

        ArrayList<Object> myListLast = new ArrayList<Object>(Arrays.asList(1, 3, 7, "Monday", "sunday"));
        System.out.println("myListLast = " + myListLast);

        List<Object> myListLast2 = new ArrayList<Object>(Arrays.asList(11, 33, 77, "Table", "Desk"));
        System.out.println("myListLast2 = " + myListLast2);

        List<Object> myListLast3 = (Arrays.asList(10, 30, 90, "Wednesday", "November"));
        System.out.println("myListLast3 = " + myListLast3);

    }
}
