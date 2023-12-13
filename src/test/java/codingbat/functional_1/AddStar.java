package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */
public class AddStar {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(addStar(Arrays.asList("a", "bb", "ccc"))); // → [1, 4, 9]
        System.out.println(addStar(Arrays.asList("hello", "there"))); // → [36, 64, 36, 64, 1]
        System.out.println(addStar(new ArrayList<>(Arrays.asList("*")))); // → []

    }

    public static List<String> addStar(List<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i,strings.get(i)+ "*");
        }

        return strings;

//        List<Integer> strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            strings2.add(strings2.get(i) + "*");
//        }

//        return strings2;

//        strings.replaceAll((x) -> x + "*");
//
//        return strings;
    }
}
