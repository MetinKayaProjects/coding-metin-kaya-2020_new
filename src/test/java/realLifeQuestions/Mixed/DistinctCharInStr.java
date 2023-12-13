package realLifeQuestions.Mixed;

import java.util.ArrayList;
import java.util.List;

/*
Count of substrings having all distinct characters
Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
Examples:
Input: Str = “gffg”
Output: 6
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
Input: str = “gfg”
Output: 5
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
 */
public class DistinctCharInStr {
    public static void main(String[] args) {
        String str = "gffg";
//        System.out.println("distinctChar(str) = " + distinctChar(str));
        System.out.println("str.substring(0,0) = " + str.substring(2, 3));
    }
    public static int distinctChar(String str){
        List<String> list = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 1; j <str.length() ; j++) {
                list.add(str.substring(i,j));
            }
        }

        return 3;
    }
}
