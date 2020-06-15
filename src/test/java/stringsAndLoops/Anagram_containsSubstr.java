package stringsAndLoops;

public class Anagram_containsSubstr {
    /*
 Given two Strings determine if they are Anagrams -> Are built of the same characters
 Exp:   String a = "listen";
        String b = "silent";
  */
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        IsAnagram(a, b);
    }

    public static void IsAnagram(String a, String b) {

        if (a.length() != b.length()) {
            System.out.println(" not ANAGRAM");
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (!a.contains(b.substring(i, i + 1))) {
                    System.out.println("NOT ANAGRAM");
                    break;
                }

            }
            System.out.println("Anagram");
        }

    }

}
