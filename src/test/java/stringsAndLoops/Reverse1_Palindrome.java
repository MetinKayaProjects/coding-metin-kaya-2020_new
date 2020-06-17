package stringsAndLoops;

/* Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if it is not
Exmp: String a = "level";
      String b = "civic";
 */
public class Reverse1_Palindrome {
    public static void main(String[] args) {

        String a = "civic";
        String b = "java";
        String c = "a";
        String d = "";
        System.out.println(isPalindrome("civic"));   //true
        System.out.println(isPalindrome(b));   //false
        System.out.println(isPalindrome(c));
        System.out.println(isPalindrome(d));
    }

    public static Boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println("word: "+ word);
        System.out.println("reversed: " + reversed);
        //return (word.equalsIgnoreCase(reversed)) ? true : false;
        if(word.equalsIgnoreCase(reversed)){
            return true;
        }else{
            return false;
        }


    }
}
