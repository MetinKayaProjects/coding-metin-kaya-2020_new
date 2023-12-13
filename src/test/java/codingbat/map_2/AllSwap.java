
package codingbat.map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
public class AllSwap {
    public static void main(String[] args) {
        String[] strArr1 = {"ab", "ac"}; //→ ["ac", "ab"]
        String[] strArr2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}; //→ ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
        String[] strArr3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}; //["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]


        System.out.println(Arrays.toString(allSwap(strArr1)));
        System.out.println(Arrays.toString(allSwap(strArr2)));
        System.out.println(Arrays.toString(allSwap(strArr3)));
    }

    public static String[] allSwap(String[] strings) {

        Map<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if (indexMap.containsKey(firstChar)) {
                // Swap the current string with the one at the index found in the map
                int swapIndex = indexMap.get(firstChar);
                String temp = strings[i];
                strings[i] = strings[swapIndex];
                strings[swapIndex] = temp;

                // Once swapped, remove the character from the map
                indexMap.remove(firstChar);
            } else {
                // If it's the first string with this starting character, put it in the map
                indexMap.put(firstChar, i);
            }
        }
        return strings;

    }
}

