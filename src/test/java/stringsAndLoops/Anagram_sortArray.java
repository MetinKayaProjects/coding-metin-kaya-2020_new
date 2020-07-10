package stringsAndLoops;

import java.util.Arrays;

public class Anagram_sortArray {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";

        if (a.length() !=b.length()){
            System.out.println("NOT Anagram");
        }

        char[] aArr = a.toCharArray();
        System.out.println(Arrays.toString(aArr));
        char[] bArr = b.toCharArray();
        System.out.println(Arrays.toString(bArr));

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        System.out.println(Arrays.toString(aArr));
        System.out.println(Arrays.toString(bArr));

        if(Arrays.toString(aArr) .equals(Arrays.toString(bArr)) ){
            System.out.println("ANAGRAM");
        }else System.out.println("NOT Anagram");



    }
}
