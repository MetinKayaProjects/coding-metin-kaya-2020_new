package realLifeQuestions.Mixed;

public class MasterCard {
    public static void main(String[] args) {

        System.out.println("- P O Z I T I F Test Scenario: \n");
        System.out.println(IsAnagram("anagram", "nagaram"));                // true (t is anagram of s)
        System.out.println(IsAnagram("a n a g r a m", "n a g a r a m"));    // true (t is anagram of s, spaces are also considered)
        System.out.println(IsAnagram("meat", "team"));                      // true (t is anagram of s)
        System.out.println(IsAnagram("cat", "cat"));                        // true (t is anagram of s)
        System.out.println(IsAnagram("x", "x"));                            // true (t is anagram of s)
        System.out.println(IsAnagram("", ""));                              // true (t is anagram of s)

        System.out.println("\n- N E G A T I F Test Scenario: \n");
        System.out.println(IsAnagram("rat", "car"));                        // false (s and t are NOT anagram)
        System.out.println(IsAnagram("brown", "crown"));                    // false (s and t are NOT anagram)
        System.out.println(IsAnagram("random", "cat"));                     // false (different size)
        System.out.println(IsAnagram("cat", ""));                           // false (different size)
        System.out.println(IsAnagram("", "cat"));                           // false (different size)
        System.out.println(IsAnagram("anagram", "n a g a r a m"));          // false (different size, spaces are also considered)
    }

    public static boolean IsAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int sumOfSChars = 0;
        int sumsOfTChars = 0;

        for (int c1 : sChars) {
            sumOfSChars += c1;
        }

        for (int c2 : tChars) {
            sumsOfTChars += c2;
        }
        return sumOfSChars == sumsOfTChars;
    }
}
