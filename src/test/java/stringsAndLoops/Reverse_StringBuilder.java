package stringsAndLoops;

public class Reverse_StringBuilder {
    public static void main(String[] args) {
        String str = "java";

        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);

        //concatinate a word, int or char:
        System.out.println(reversed.append("-ali").toString());
    }
}
