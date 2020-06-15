package stringsAndLoops;

/* Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if it is not
Exmp: String a = "level";
      String b = "civic";
 */
public class Reverse1_Palindrome {
    public static void main(String[] args) {

        String a = "civic";
        System.out.println(isPalindrome(a));   //true

        String b = "java";
        System.out.println(isPalindrome(b));   //false
    }

    public static Boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println("word: "+ word);
        System.out.println("reversed: " + reversed);
        return (word.equalsIgnoreCase(reversed)) ? true : false;
    }
}
