package codingbat.warmup1;

/*
Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class delDelete {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc")); //→ "abc"
        System.out.println(delDel("adelHello")); //→ "aHello"
        System.out.println(delDel("adedbc")); //→ "adedbc"
        System.out.println(delDel("ade")); //→ "ade"
        System.out.println(delDel("adel")); //→ "a"
        System.out.println("empty string :" +delDel("")); //→ ""
    }

    public static String delDel(String str) {
//        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
//            // First char + rest of string starting at 4
//            return str.substring(0, 1) + str.substring(4);
//        }
//        // Otherwise return the original string.
//        return str;

        return (str.length() < 4)
                ? str
                : (str.substring(1, 4).equalsIgnoreCase("del"))
                ? str.charAt(0) + str.substring(4)
                : str;
    }
}
