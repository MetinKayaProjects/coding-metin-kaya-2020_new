package codingbat.functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.

        noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
        noYY(["a", "b", "cy"]) → ["ay", "by"]
        noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
public class NoYY {
    public static void main(String[] args) {

        System.out.println(noYY(Arrays.asList("a", "b", "c")));
        System.out.println(noYY(Arrays.asList("a", "b", "cy")));
        System.out.println(noYY(Arrays.asList("a", "b", "cy")));
        System.out.println(noYY(new ArrayList<>(List.of("xx", "ya", "zz"))));
        System.out.println(noYY(new ArrayList<>(List.of("yyx", "y", "zzz")))); //["zzzy"]
        System.out.println(noYY(new ArrayList<>(List.of()))); //[]

    }

    public static List<String> noYY(List<String> strings) {

        return strings.stream()
                .map(x -> x+"y")
                .filter(x -> !x.contains("yy"))
                .collect(Collectors.toList());

    }
}
