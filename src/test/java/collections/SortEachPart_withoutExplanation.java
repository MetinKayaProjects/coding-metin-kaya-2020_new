package collections;

import java.util.Arrays;

/*
   TASK-1 day6
   Create a method that will take any String of letters
   and numbers and sort each substring of numbers and letters
        Input: "DC501GCCCA098911"
        OutPut: "CD015ACCCG011899"
    */
public class SortEachPart_withoutExplanation {
    public static void main(String[] args) {
        sortedEach("DC501GCCCA098911"); //sorted = CD501ACCCG098911
//          unsortedStr = DC501GCCCA098911
//            sortedStr = CD015ACCCG011899

    }

    public static void sortedEach(String str) {

        System.out.println("unsortedStr = " + str);

        String sorted = "";
        String eachPart = "";
        for (int i = 0; i < str.length(); i++) {
            eachPart += str.charAt(i);

            if (Character.isLetter(str.charAt(i))) {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    sorted += sortedSubString(eachPart);
                    eachPart = "";
                }
            } else {
                if (Character.isDigit(str.charAt(i))) {
                    if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                        sorted += sortedSubString(eachPart);
                        eachPart = "";
                    }
                }
            }
        }
        System.out.println("sortedStr = " + sorted);
    }

    public static String sortedSubString(String str) {

        String[] strArr = str.split("");
        Arrays.sort(strArr);
        String eachSorted = "";
        for (String s : strArr) {
            eachSorted += s;
        }
        return eachSorted;
    }
}
