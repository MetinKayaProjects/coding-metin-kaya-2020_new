package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Task - 4  day6
    Create a method that will accept a String and return a version
    that has only the unique characters.
     Ex: unique("AAABCCCDDEFFS") ==> ”BES"
     unique("AAABCCCDDEFFSGTTJB") ==> ESGJ
     */
public class UniqueCharactersByArray {
    public static void main(String[] args) {
        String str = "AAABCCCDDEFFS";
        System.out.println("str = " + str);

        String[] strArr = str.split("");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        List<String> myList = new ArrayList<>(Arrays.asList(strArr));
        System.out.println("myList = " + myList);
        List<String> unique = new ArrayList<>();

//        String strUnique = "";
        for (int i = 0; i < myList.size(); i++) {
            int count = 0;
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(i) == myList.get(j) && i!=j) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(myList.get(i));
            }
        }
        System.out.println("Unique = " + unique);
    }

//    public static void unique(String str) {


//        for (int i = 0; i < strArr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < strArr.length; j++) {
//                if (strArr[i] == strArr[j]) {
//                    count++;
//
//                }
//            }
//            if (count == 1) {
//                strUnique += strArr[i];
//            }
//        }
//        System.out.println("strUnique = " + strUnique);
//    }
}
