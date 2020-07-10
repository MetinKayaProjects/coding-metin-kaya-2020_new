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
        System.out.println("a: " + isBalanced("{([])}"));
        System.out.println("b: " + isBalanced("{[]}"));
        System.out.println("c: " + isBalanced("{({)}"));
        System.out.println("d: " + isBalanced("{({)}"));
        System.out.println("e: " + isBalanced("{)]"));
        System.out.println("f: " + isBalanced("[]([){}"));

        System.out.println("g: " + isBalanced("{(a,b)}"));
        System.out.println("h: " + isBalanced("{(a},b)"));
        System.out.println("i: " + isBalanced("{)(a,b}"));
    }

    public static Boolean isBalanced(String s) {
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


