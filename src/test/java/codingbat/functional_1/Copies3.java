package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */
public class Copies3 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(copies3(Arrays.asList("a", "bb", "ccc"))); // → ["aaa", "bbbbbb", "ccccccccc"]
        System.out.println(copies3(Arrays.asList("24", "a", ""))); // → ["242424", "aaa", ""]
        System.out.println(copies3(new ArrayList<>(Arrays.asList("hello", "there")))); // → ["hellohellohello", "theretherethere"]

    }

    public static List<String> copies3(List<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i,strings.get(i)+ strings.get(i) + strings.get(i));
        }

        return strings;

//        List<Integer> strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            strings2.add(strings.get(i) + strings.get(i)+ strings.get(i) + strings.get(i));
//        }

//        return strings2;

//        strings.replaceAll((x) -> x + x + x);
//
//        return strings;
    }
}
