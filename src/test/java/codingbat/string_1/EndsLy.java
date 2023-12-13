package codingbat.string_1;
/*
Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("Ly"));// → true
        System.out.println(endsLy("oddy"));// → false
    }
    public static boolean endsLy(String str){
        return str.length() >= 2 && str.substring(str.length() -2).equalsIgnoreCase("ly");

    }
}
