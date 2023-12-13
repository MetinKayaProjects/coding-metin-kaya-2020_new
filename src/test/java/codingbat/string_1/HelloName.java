package codingbat.string_1;
/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class HelloName {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));// → "Hello Bob!"
    }

    public static String helloName(String name){

        return "Hello "+ name + "!";
    }
}
