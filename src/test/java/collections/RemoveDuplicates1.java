package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
   Create a method that will accept a String and returns
   a version that removes duplicate instances of any character
   Ex: removeDup("AAABBBCCCD") ==> ABCD
    */
public class RemoveDuplicates1 {
    public static void main(String[] args) {
        uniqueChar("AAABBBCCCD");
    }

    public static void uniqueChar(String str) {

        System.out.println("str = " + str);
        String[] strArr = str.split("");
        String str2 = "";
        Set<String> unique = new HashSet<String>(Arrays.asList(strArr));
        System.out.println("unique = " + unique);
        for (String s : unique) {
            str2 += s;
        }
        System.out.println("str2 = " + str2);
    }

}
