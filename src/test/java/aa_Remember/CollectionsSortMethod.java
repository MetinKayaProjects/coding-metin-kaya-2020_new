package aa_Remember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSortMethod {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();

        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList("A", "B", "Ali", "Ceyhan"));

        //  Collections.sort(myList2)
        Collections.sort(myList2);
        System.out.println("myList2 = " + myList2);
    }
}
