package stringsAndLoops;

import java.util.Arrays;

public class Anagram_forLoop {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        System.out.println(isAnagram(a, b));

    }

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        char[] cArr = new char[aArr.length];
        int k = 0;
        for (int i = 0; i < aArr.length; i++) {               //listen
            for (int j = 0; j < aArr.length; j++) {          // silent
                if (aArr[i] == bArr[j]) {
                    cArr[k] = bArr[j];
                    k++;
                }
            }
        }
        System.out.println("cArr = " + Arrays.toString(cArr));
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            c += cArr[i];
        }
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        return (a.equalsIgnoreCase(c)) ? true : false;

    }
}
