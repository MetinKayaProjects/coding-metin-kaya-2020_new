package practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int num2 = 100;

        System.out.println("isPalindrome(num) = " + isPalindrome(num));
        System.out.println("***********************\n");
        System.out.println("isPalindrome(num) = " + isPalindrome(num2));

    }

    private static Boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String numStrReversed = "";
        for (int i = numStr.length()-1; i >= 0 ; i--) {
            numStrReversed += numStr.charAt(i);
        }
        System.out.println("numStr = " + numStr);
        System.out.println("numStrReversed = " + numStrReversed);

        return numStr.equals(numStrReversed);
//        return num == Integer.parseInt(numStrReversed);
    }
}
