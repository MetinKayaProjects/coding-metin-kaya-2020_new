package collections;

import java.util.Stack;

/*
 * Question:
 * Given a string of braces, return whether the string is balanced or not.
 *
 * Valid chars: (, ), {, }, [, ]
 *
 * {([])} = balanced, {[()]} = balanced, [{()}] = balanced,
 * () = balanced,
 * {[]} = balanced,
 * {({)} = unbalanced,
 * {)] = unbalanced,
 * [](){} = balanced,
 * [(]) = unbalanced
 */
public class BalancedParanthensies_Stack {
    public static void main(String[] args) {
        System.out.println("a: " + balancedParenthensies("{([])}"));
        System.out.println("b: " + balancedParenthensies("{[]}"));
        System.out.println("c: " + balancedParenthensies("{({)}"));
        System.out.println("d: " + balancedParenthensies("{({)}"));
        System.out.println("e: " + balancedParenthensies("{)]"));
        System.out.println("f: " + balancedParenthensies("[]([){}"));

        System.out.println("g: " + balancedParenthensies("{(a,b)}"));
        System.out.println("h: " + balancedParenthensies("{(a},b)"));
        System.out.println("i: " + balancedParenthensies("{)(a,b}"));
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);  //stac'e c character'lerini ekledi. c=[ [, (, { ]
                //System.out.println("stack = "+ i+" - " + stack);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {  //stack.pop(); son elemani return eder ve listeden de remove eder
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}


