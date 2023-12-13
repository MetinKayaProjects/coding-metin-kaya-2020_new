
package codingbat.map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 */
public class FirstSwap {
    public static void main(String[] args) {
        String[] strArr1 = {"ab", "ac"};
        String[] strArr2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] strArr3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};


        System.out.println(Arrays.toString(firstSwap(strArr1)));
        System.out.println(Arrays.toString(firstSwap(strArr2)));
        System.out.println(Arrays.toString(firstSwap(strArr3)));
    }

    public static String[] firstSwap(String[] strings) {

        Map<Character, Integer> firstCharIndexMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (firstCharIndexMap.containsKey(firstChar)) {
                int firstOccurrenceIndex = firstCharIndexMap.get(firstChar);

                // Check if this is the first swap for the character
                if (firstOccurrenceIndex != -1) {
                    // Swap the strings
                    String temp = strings[i];
                    strings[i] = strings[firstOccurrenceIndex];
                    strings[firstOccurrenceIndex] = temp;

                    // Disable further swaps for this first char
                    firstCharIndexMap.put(firstChar, -1);
                }
            } else {
                // Store the index of the first occurrence of the char
                firstCharIndexMap.put(firstChar, i);
            }
        }

        return strings;


    }
}

