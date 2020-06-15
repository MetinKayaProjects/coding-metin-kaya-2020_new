package stringsAndLoops;
/*
       Task 3: Create a method that will accept a number (long)
        and determine if the number of palindrome or not.
        */
public class ReverseNumber_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(1203021));
    }
    public static boolean palindrome(long num){
        long remain = num;  //1203021
        long reverseNum =0; //1203021
        long digit = 0;

        while (remain !=0){
            digit = remain %10;                     //1         2       0       3       0       2
            reverseNum = reverseNum * 10 + digit;   //1         12      120     1203    12030   120302  1203021
            remain /=10;                            //120302    12030   1203    120     12      1

        }
        return num == reverseNum;
    }
}
