package realLifeQuestions.Mixed;

/*
Problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
s and t only consist of lowercase English letters.

An Anagram is a word or phrase formed by rearranging the letters of a different work or phrase,
typically using all the original letters exactly once.

    Example 1: Input: s = “anagram”, t = “nagaram”; Output: true
    Example 2: Input: s = “rat”, t = “car”; Output: false
Implement a function called IsAnagram. Consider readability, time complexity, and unit tests.
 */
public class MasterCardWithDescription {
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
        System.out.println(IsAnagram("anagram", "n a g a r a m"));           // false (different size, spaces are also considered)

    }

//    I created an "IsAnagram" method. I used static keyword to call it from main method which is also static.
    public static boolean IsAnagram(String s, String t) {
/*
    Based on requirement:
    - s and t only consist of lowercase English letters. So I didn't use s.toLoweCase()
    - The requirement doesn't want me to remove spaces, so I didin't use replace() method,  trim() method to remove the space at the end.
        String str1 = s.replace(" ", "").toLowerCase().trim();
        String str2 = t.replace(" ", "").toLowerCase().trim();
         */

// If s and t are not the same length, s and t are naturally NOT anagrams:
        if (s.length() != t.length()) {
//            System.out.println("\"" + s + "\" and " + "\"" + t + "\" is not anagram, because both have different size!" );
            return false;
        }
// I converted String values to the char arrays here:
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

// And I added the ASCII value of each character to the sum:
        int sumOfSChars = 0;
        int sumsOfTChars = 0;

        for (int c1 : sChars) {
            sumOfSChars += c1;
        }

        for (int c2 : tChars) {
            sumsOfTChars += c2;
        }
// I could print the sum values in the console, but it is not requested in the requirement, so I commented out this part:
//        System.out.println("sumOfSChars = " + sumOfSChars);
//        System.out.println("sumsOfTChars = " + sumsOfTChars);

// It will return TRUE if sumOfSChars and sumsOfTChars are equal, otherwise FALSE.
        return sumOfSChars == sumsOfTChars;
    }
}
