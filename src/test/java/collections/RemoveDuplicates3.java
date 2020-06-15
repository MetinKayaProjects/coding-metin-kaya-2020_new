package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
   Create a method that will accept a String and returns
   a version that removes duplicate instances of any character
   Ex: removeDup("AAABBBCCCD") ==> ABCD
    */
public class RemoveDuplicates3 {
    public static void main(String[] args) {
        String str = "AAABBBCCCD";
        removeDupValues(str);  //ABCD

    }

    public static void removeDupValues(String str) {

        String[] strArr = str.split("");
        System.out.println("strArr = " + Arrays.toString(strArr));

        Set<String> set = new HashSet<String>(Arrays.asList(strArr));
        System.out.println("set = " + set);

        String setStr = set.toString().replace("[", "")
                                      .replace("]", "")
                                      .replace(",", "");

        System.out.println("setStr = " + setStr);

    }

}
