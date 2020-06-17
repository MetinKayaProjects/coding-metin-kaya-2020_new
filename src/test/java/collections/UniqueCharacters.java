package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Task - 4  day6
    Create a method that will accept a String and return a version
    that has only the unique characters.
     Ex: unique("AAABCCCDDEFFS") ==> ”BES"
     unique("AAABCCCDDEFFSGTTJB") ==> ESGJ
     */
public class UniqueCharacters {
    public static void main(String[] args) {
        uniqueChar("AAABCCCDDEFFS");
        uniqueChar("AAABCCCDDEFFSGTTJB");
    }
    public static void uniqueChar(String str){
        String unique = "";
        String[] strArr = str.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(strArr));
        for (String s:list) {
            int count = Collections.frequency(list,s);
            if (count == 1){
                unique += s;
            }
        }
        System.out.println("unique = " + unique);
    }
}
