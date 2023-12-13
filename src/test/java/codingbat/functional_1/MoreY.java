package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */
public class MoreY {
    public static void main(String[] args) {

        System.out.println(moreY(Arrays.asList("a", "b", "c")));
        System.out.println(moreY(Arrays.asList("hello", "there"))); 
        System.out.println(moreY(new ArrayList<>(Arrays.asList("yay")))); 

    }

    public static List<String> moreY(List<String> strings){
//        for (int i = 0; i < strings.size(); i++) {
//            strings.set(i,"y" +strings.get(i)+ "y");
//        }
//
//        return strings;

//        List<Integer> strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            strings2.add("y"+ strings2.get(i) + "y");
//        }

//        return strings2;

        strings.replaceAll((x) ->  "y" + x + "y");

        return strings;
    }
}
