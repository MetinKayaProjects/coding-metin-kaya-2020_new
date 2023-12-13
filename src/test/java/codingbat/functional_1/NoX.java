package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list where each string has all its "x" removed.


noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */
public class NoX {
    public static void main(String[] args) {

        System.out.println(lower(Arrays.asList("ax", "bb", "cx")));
        System.out.println(lower(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(lower(new ArrayList<>(Arrays.asList("x"))));

    }

    public static List<String> lower(List<String> strings){
//        for (int i = 0; i < strings.size(); i++) {
//            strings.set(i,strings.get(i).replaceAll("x",""));
//
//        }
//
//        return strings;

//        List<String > strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            String str = strings.get(i);
//            strings2.add(str.replaceAll("x", ""));
//        }
//        return strings2;

//        strings = strings.stream()
//                .map(x -> x.replace("x", ""))
//                .collect(Collectors.toList());
//
//        return strings;

        return strings.stream()
                .map(x -> x.replace("x", ""))
                .collect(Collectors.toList());
    }
}
