package practice;

import java.util.HashMap;
import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        1997 = M+CM+XC+VIII
        saga 3 eklenebilir, sola sadece 1

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 */
public class RomanToInt {
    public static void main(String[] args) {

        String str = "III";
        String str1 = "VI";
        String str2 = "MCMXCIV";
        String str3 = "A";


        System.out.println("romanToInt(str) = " + romanToInt(str));
        System.out.println("romanToInt(str1) = " + romanToInt(str1));
        System.out.println("romanToInt(str2) = " + romanToInt(str2));
        System.out.println("romanToInt(str3) = " + romanToInt(str3));

        System.out.println("******************\n");

        System.out.println("romanToInt2(str) = " + romanToInt2(str));
        System.out.println("romanToInt2(str1) = " + romanToInt2(str1));
        System.out.println("romanToInt2(str2) = " + romanToInt2(str2));
//        System.out.println("romanToInt2(str3) = " + romanToInt2(str3));
    }


    public static int romanToInt(String s) {

        Map<Character, Integer> mapList = new HashMap<>();

        mapList.put('I', 1);
        mapList.put('V', 5);
        mapList.put('X', 10);
        mapList.put('L', 50);    //154 = CLIV
        mapList.put('C', 100);
        mapList.put('D', 500);
        mapList.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (!mapList.containsKey(s.charAt(i))) {
                return 0;
            }
        }
        // III
        // MCMXCIV

        int result = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {                 // I                 I                I
            int currentValue = mapList.get(c);           // 1                 1                1
            if (currentValue > prevValue) {              // 1>0               1!>1            -
                result += currentValue - 2 * prevValue;  // result= 1-2.0=1
            } else {
                result += currentValue;                 //                    result= 1+1=2   2+1=3
            }
            prevValue = currentValue;                  // prevValue = 1       1               1
        }


        return result;                                // result = 3
    }

    public static int romanToInt2(String s) {

        Map<Character, Integer> mapList = new HashMap<>();

        mapList.put('I', 1);
        mapList.put('V', 5);
        mapList.put('X', 10);
        mapList.put('L', 50);    //154 = CLIV
        mapList.put('C', 100);
        mapList.put('D', 500);
        mapList.put('M', 1000);


//        for (int i = 0; i < s.length(); i++) {
//            if (!mapList.containsKey(s.charAt(i))) {
//                return 0;
//            }
//        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char nextChar = (i < s.length() - 1) ? s.charAt(i + 1) : '\0';
            if (currentChar == 'I') {
                result += (nextChar == 'V' || nextChar == 'X') ? (-1) : 1;
            } else if (currentChar == 'V') {
                result += 5;
            } else if (currentChar == 'X') {
                result += (nextChar == 'L' || nextChar == 'C') ? (-10) : 10;
            } else if (currentChar == 'L') {
                result += 50;
            } else if (currentChar == 'C') {
                result += (nextChar == 'D' || nextChar == 'M') ? (-100) : 100;
            }else if (currentChar == 'D') {
                result += 500;
            }else if (currentChar == 'M') {
                result += 1000;
            }

        }


        return result;
    }


}
