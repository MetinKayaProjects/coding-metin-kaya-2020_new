package stringsAndLoops;

import java.util.Arrays;

/*
Write a code to reverse a sentence word by word
String str = "New York";
String reversedWordByWord = "weN kroY"
 */
public class ReverseWordByWord {
    public static void main(String[] args) {
        reversedWordBy("New York");
    }

    public static String subReverse(String str) {
        String subReversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            subReversed += str.charAt(i);
        }
        return subReversed;
    }

    public static void reversedWordBy(String str) {

        String[] strArr = str.split(" ");
        System.out.println("strArr = " + Arrays.toString(strArr));

        String strReversedByWord = "";

        for (int i = 0; i < strArr.length; i++) {
            strReversedByWord += subReverse(strArr[i]) + " ";
        }
        System.out.println("strReversedByWord = " + strReversedByWord);
    }
}
