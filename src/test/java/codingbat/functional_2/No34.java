package codingbat.functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


        no34(["a", "bb", "ccc"]) → ["a", "bb"]
        no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
        no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public class No34 {
    public static void main(String[] args) {

        System.out.println(no34(Arrays.asList("a", "bb", "ccc")));
        System.out.println(no34(Arrays.asList("a", "bb", "ccc", "dddd")));
        System.out.println(no34(new ArrayList<>(List.of("ccc", "dddd", "apple"))));
//        System.out.println(no34(new ArrayList<>(List.of("a", "b", "c"))));

    }

    public static List<String> no34(List<String> strings) {

        return strings.stream()
                .filter(x -> x.length() != 4 && x.length() != 3)
                .collect(Collectors.toList());

    }
}
