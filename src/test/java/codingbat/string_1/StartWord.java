package codingbat.string_1;
/*
Given a string and a second "word" string,
we'll say that the word matches the string if it appears at the front of the string,
except its first char does not need to match exactly.
On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));// → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h"
        System.out.println(startWord("x", "ix"));// → ""
        System.out.println(startWord("", "i"));// → ""
        System.out.println(startWord("hip", "zi"));// → "hi"
        System.out.println(startWord("hip", "zig"));// → ""
        System.out.println(startWord("h", "z"));// → "h"
        System.out.println(startWord("hippo", "xyz"));// → ""
        System.out.println(startWord("kit", "cit"));// → "kit"
    }
    public static String startWord(String str, String word){
        String strNew = "";
        int strLength = str.length();
        int wordLength = word.length();

        if (strLength < wordLength){
            strNew = "";
        } else {
            if (str.substring(1,wordLength).equalsIgnoreCase(word.substring(1 ))){
                strNew = str.substring(0,wordLength);
            }
        }

//        return str.substring(0, wordLength);
        return strNew;
    }
}
