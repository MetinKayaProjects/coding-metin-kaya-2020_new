package codingbat.functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

        noLong(["this", "not", "too", "long"]) → ["not", "too"]
        noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
        noLong(["cccc", "cccc", "cccc"]) → []
 */
public class NoLong {
    public static void main(String[] args) {

        System.out.println(noLong(Arrays.asList("this", "not", "too", "long")));
        System.out.println(noLong(Arrays.asList("a", "bbb", "cccc")));
        System.out.println(noLong(new ArrayList<>(List.of("cccc", "cccc", "cccc"))));
        System.out.println(noLong(new ArrayList<>(List.of("a", "b", "c"))));

    }

    public static List<String> noLong(List<String> strings) {

        return strings.stream()
                .filter(x -> x.length() < 4)
                .collect(Collectors.toList());

    }
}
