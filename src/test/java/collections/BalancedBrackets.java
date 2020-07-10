package collections;

import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String str) {
        Stack<Character> characters = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{') {
                characters.push('}');
            } else if (c == '[') {
                characters.push(']');
            } else if (c == '(') {
                characters.push(')');
            } else if (!characters.isEmpty()) {
                if (c != characters.pop()) {
                    return "FALSE";
                }
            } else return "FALSE";
        }
        if (!characters.isEmpty()) {
            return "FALSE";
        }
        return "TRUE";
    }


    public static void main(String[] args) {
        System.out.println("1: " + isBalanced("[{}]"));
        System.out.println("2: " + isBalanced("{[(])}"));
        System.out.println("3: " + isBalanced("{{[[(())]]}}"));
        System.out.println("4: " + isBalanced("{}"));
        System.out.println("5: " + isBalanced("[]{}"));
        System.out.println("6: " + isBalanced("}][}}(}][))]"));
        System.out.println("7: " + isBalanced("[](){()}"));
        System.out.println("8: " + isBalanced("()"));
        System.out.println("9: " + isBalanced("({}([][]))[]()"));
        System.out.println("10: " + isBalanced("{)[](}]}]}))}(())("));
        System.out.println("11: " + isBalanced("([[)"));

    }
}