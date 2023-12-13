package codingbat.string_1;
/*
Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 */
public class TwoChar {
    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));// → "ja" //(0,2)
        System.out.println(twoChar("java", 2));// → "va" //2,4
        System.out.println(twoChar("java", 3));// → "ja"
        System.out.println(twoChar("javac", 3));// → "ac"

        System.out.println(twoChar("javac", 4));// → "ja"
        System.out.println(twoChar("javac", 5));// → "ja"
        System.out.println(twoChar("javac", 6));// → "ja"
        System.out.println(twoChar("Hello", -7)); // "He"

    }

    private static String  twoChar(String str, int index) {
        String newStr= "";
        if (index < 0 || index == str.length()-1 || index == str.length() || index > str.length()){
            newStr = str.substring(0,2);
        } else if (index < str.length()-1) {
            newStr = str.substring(index, index+2);
        }
        return newStr;
    }


}
