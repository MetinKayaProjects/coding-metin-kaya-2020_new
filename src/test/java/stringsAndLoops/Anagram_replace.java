package stringsAndLoops;

public class Anagram_replace {
    /*
Given two Strings determine if they are Anagrams -> Are built of the same characters
 */
    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";
//        System.out.println("isAnagram(a,b) = " + isAnagram1(a, b));
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }

        for (int i = 0; i < a.length(); i++) {

            b = b.replaceFirst(a.charAt(i) + "", "");
        }

        if (b.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }

//    public static boolean isAnagram1(String a, String b) {
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        String c ="";
//        if (a.length() != b.length()) {
//            return false;
//        }
//        for (int i = 0; i < a.length(); i++) {
//            if (a.contains("" + b.charAt(i))) {
//                c += b.charAt(i);
//
//            }
//        }
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//
//        return c.equals(b);
//    }
}
