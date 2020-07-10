package stringsAndLoops;
/*
       Task 3: Create a method that will accept a number (long)
        and determine if the number of palindrome or not.
        */
public class ReverseNumber2_PalindromeNums {
    public static void main(String[] args) {
        System.out.println(palindrome(1203021));
    }
    public static Boolean palindrome(int num){
        int reverseNum=0;
        String strNum = String.valueOf(num);
        String reverseStrNum = "";
        for (int i = strNum.length()-1; i>=0; i--){
            reverseStrNum += strNum.charAt(i);
        }
        reverseNum = Integer.parseInt(reverseStrNum);
        return num == reverseNum;
    }
}
