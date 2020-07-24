package stringsAndLoops;
/*
RECURSION IN JAVA
Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve
some problem. A method that uses this technique is recursive. Many programming problems can be
solved only by recursion, and some problems that can be solved by other techniques are better solved by
recursion.
 */
public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(4) = " + factorial(4));
        System.out.println("factorial(5) = " + factorial(5));

    }
    public static long factorial(int n){
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
