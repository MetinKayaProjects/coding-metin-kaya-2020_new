package codingbat.string_2;
/*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
countCode("xxcozeyycop") → 1
countCode("cozcop") → 0
 */
public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
        System.out.println(countCode("xxcozeyycop"));
        System.out.println(countCode("cozcop"));
    }
    public static int countCode(String str) {

       int countCoDe = 0;
        for (int i = 0; i < str.length()-3; i++) {
//            if (str.substring(i, i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                countCoDe++;
            }
        }
        return countCoDe;
    }

}
