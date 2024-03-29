package codingbat.string_1;
/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */
public class FrontTRUE {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));// → true
        System.out.println(frontAgain("edit"));// → false
        System.out.println(frontAgain(""));// → true
        System.out.println(frontAgain("ed"));// → true
    }
    public static boolean frontAgain(String str){

//        if (str.length() >= 2 ){
//            if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2))){
//                return true;
//            }
//        }
        return str.length() >=2 && (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2 )));
//        return false;
    }
}
