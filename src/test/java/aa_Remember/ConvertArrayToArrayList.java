package aa_Remember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c", "d", "e"};
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));

//        Method-1 : Arrays.asList(strArray);
//        List<String> list = new ArrayList<String>(Arrays.asList(strArray));
        List<String> list1 = Arrays.asList(strArray);
        System.out.println("list - 1 = " + list1);


//        Method-2 : Collections.addAll(list2, strArray);
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, strArray);
        System.out.println("list - 2 = " + list2);


//        Method-3 : forEach loop
        List<String> list3 = new ArrayList<>();
        for(String s : strArray){
            list3.add(s);
        }
        System.out.println("list - 3 = " + list3);

        List<String> list4 = new ArrayList<>();
        for (int i=0; i < strArray.length; i++){
            list4.add(strArray[i]);
        }
        System.out.println("list - 4 = " + list4);

    }
}
