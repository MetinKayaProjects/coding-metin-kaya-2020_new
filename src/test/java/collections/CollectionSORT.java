package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSORT {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99,3,5,1,87,45,101,20));
        System.out.println("numbers = " + numbers);

        Collections.sort(numbers);
        System.out.println("numbersSorted = " + numbers);
    }
}
