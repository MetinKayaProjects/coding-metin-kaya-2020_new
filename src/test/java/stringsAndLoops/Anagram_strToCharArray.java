package stringsAndLoops;

public class Anagram_strToCharArray {

    public static void main(String[] args) {
//        System.out.println(isAnagram("listen", "Silent"));
        System.out.println(isAnagram("hi", "hello"));
//        System.out.println(isAnagram("java", "soft"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        String str1 = s.replace(" ", "").toLowerCase().trim();
        String str2 = t.replace(" ", "").toLowerCase().trim();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int sumstr1 = 0;
        int sumstr2 = 0;
        for (int c1 : chars1) {
            sumstr1 += c1;
        }
        for (int c2 : chars2) {
            sumstr2 += c2;
        }

        System.out.println("sumstr1 = " + sumstr1);
        System.out.println("sumstr2 = " + sumstr2);

        return sumstr1 == sumstr2;
    }
}