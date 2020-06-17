package stringsAndLoops;

public class Reverse_StringBuilder {
    public static void main(String[] args) {

        palindrome("java");
        palindrome("civic");

    }
    public static void palindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);

        if (str.equalsIgnoreCase(String.valueOf(reversed))) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        //concatinate a word, int or char:
//        System.out.println(reversed.append("-ali").toString());
    }
}
