package stringsAndLoops;
/*
RECURSION IN JAVA
Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve
some problem. A method that uses this technique is recursive. Many programming problems can be
solved only by recursion, and some problems that can be solved by other techniques are better solved by
recursion.
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        printFibo(9);
    }

    static int n1=1, n2=2, n3=0;
    public static void printFibo(int count){
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count-1);
        }
    }
}
