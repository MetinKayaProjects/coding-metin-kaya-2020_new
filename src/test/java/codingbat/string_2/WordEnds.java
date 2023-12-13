package codingbat.string_2;

/*
Given a string and a non-empty word string,
return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */
public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {

        int strLen = str.length();
        int wordLen = word.length();
        String result = "";
        for (int i = 0; i < strLen - wordLen + 1; i++) {
            String tmp = str.substring(i, i + wordLen);
            if (i > 0 && tmp.equals(word))
                result += str.substring(i - 1, i);
            if (i < strLen - wordLen && tmp.equals(word))
                result += str.substring(i + wordLen, i + wordLen + 1);
        }
        return result;


//        String result = "";
//        int i=0;
//        int end = 0;
//        int l =str.length();
//        while( i < str.length()) {
//
//            end = i + word.length();
//            if( end > l) {
//                end=l;
//            }
//
//            if(str.substring(i,end).equals(word)) {
//
//                if(i>0) {
//                    result = result + str.charAt(i-1);
//                }
//
//                if(i+word.length() <l) {
//                    result = result + str.charAt(end);
//                }
//
//            }
//            i++;
//        }
//        return result;
    }

}
