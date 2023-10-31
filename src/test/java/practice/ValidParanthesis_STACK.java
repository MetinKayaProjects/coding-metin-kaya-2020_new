package practice;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
public class ValidParanthesis_STACK {

    public static void main(String[] args) {

        //true
//        String s = "()";
//        String s = "()[]{}";
//        String s = "{[]}";
//        String s = "()[]{}";

//        //false
//        String s = "([){]}";
//        String s = "(][)";
//        String s = "(]";
        String s = "][";



        System.out.println("validParanthesis.isValid(s) = " + isValid(s));

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // Closing parenthesis with no matching opening parenthesis
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched opening and closing parenthesis
                }
            }
        }

        return stack.isEmpty();
    }
}
