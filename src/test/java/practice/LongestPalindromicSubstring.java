package practice;

import java.util.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

//        String s = "aa";  //NOT WORKING FOR THIS result is a
        String s = "ab";
//        String s = "abcd";
//        String s = "babad";
//        String s = "cbbd";
//        String s = "civic";
        System.out.println("longestPalindrome(s) = " + longestPalindrome(s));
    }

    /*
    Given a string s, return the longest palindromic substring in s.
Example 1:
    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.

    input: abcda

Example 2:
    Input: s = "cbbd"
    Output: "bb"
     */
    public static String longestPalindrome(String s) {
        Map<String, Integer> mapPalindroms = new HashMap<>();
        String substring = "";
        String substringPal = "";

        if (s.length() == 2 ) {
            substringPal = (s.charAt(0)==s.charAt(1))?s.substring(0, 2): s.substring(0,1);
        } else if (s.length() == 1 ) {
            substringPal = s;
        } else {

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length() + 1; j++) {
                    if (i < j) {
//                    substring = "" + Character.toString(s.charAt(i)) + Character.toString(s.charAt(j));
                        substring = s.substring(i, j); //01 b
                        System.out.println("substring = " + substring);
                        if (substring.length() > 1) {
                            if (isPalindrome(substring)) {
                                substringPal = substring; //
                            }
                        }
                        mapPalindroms.put(substringPal, substringPal.length());

                    }
                }

            }
//            System.out.println("mapPalindroms999999 = " + mapPalindroms.values().size());
//            if(mapPalindroms.values().size() == 1) {
//                substringPal = "" + s.charAt(0);
//            }

            int maxValue = 0;
            for (int n : mapPalindroms.values()) {
                System.out.println("n = " + n);
                if (n > maxValue) {
                    maxValue = n;
                }
            }
            for (String key : mapPalindroms.keySet()) {
                if (mapPalindroms.get(key) == maxValue) {
                    substringPal = key;
                }
            }

            System.out.println("substringPal = " + substringPal);
        }

        return substringPal;
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }
}
