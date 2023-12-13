package codingbat.warmup2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
stringBits("") → ""
 */
public class StringBits {
    public static void main(String[] args) {
        System.out.println("stringBits(\"Hello\") = " + stringBits("Hello"));// → "Hlo"
        System.out.println("stringBits(\"Hi\") = " + stringBits("Hi"));// → "H"
        System.out.println("stringBits(\"Heeololeo\") = " + stringBits("Heeololeo"));// → "Hello"
        System.out.println("stringBits(\"\") = " + stringBits(""));// → ""
    }

    public static String stringBits(String str) {
        String strNew = "";

//        for (int i = 0; i < str.length(); i++) {
//            if (i % 2 == 0) {
//                strNew += str.charAt(i);
//            }
//        }
        for (int i = 0; i < str.length(); i=i+2) {

                strNew += str.charAt(i);

        }

        return strNew;
    }
}
