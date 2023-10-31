package codingbat;

import java.util.Scanner;

/*
1. ask user to type a string in the command line
2. Take the string , check if it is palindrome
3. Print “User input is {input}, it is (or is not) a palindrome”
 */
public class ScannerStringPalindrome {
    public static void main(String[] args) {

        String reversed = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Provide a string value: ");
        String str1 = input.nextLine();

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        if (reversed.equals(str1)) {
            System.out.println("User input is " + str1 + ", it is a palindrome");
        } else {
            System.out.println("User input is " + str1 + ", it is not a palindrome");
        }

        System.out.println("**************** from the method************");
        isPalindrome("civic");
    }

    public static void isPalindrome(String input) {

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (reversed.equals(input)) {
            System.out.println("User input is " + input + ", it is a palindrome");
        } else {
            System.out.println("User input is " + input + ", it is not a palindrome");
        }

    }

}
