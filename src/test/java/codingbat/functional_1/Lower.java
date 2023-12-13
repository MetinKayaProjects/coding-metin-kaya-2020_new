package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class Lower {
    public static void main(String[] args) {

        System.out.println(lower(Arrays.asList("Hello", "Hi"))); 
        System.out.println(lower(Arrays.asList("AAA", "BBB", "ccc"))); 
        System.out.println(lower(new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE")))); 

    }

    public static List<String> lower(List<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i,strings.get(i).toLowerCase());
        }

        return strings;

//        List<String > strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            strings2.add(strings.get(i).toLowerCase());
//        }
//
//        return strings2;

//        strings.replaceAll((x) -> x.toLowerCase());
////        strings.replaceAll(String::toLowerCase);
//
//        return strings;
    }
}
