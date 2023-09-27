package stringsAndLoops;

public class IsDigitInString {
    public static void main(String[] args) {
        String str = " Hel3o W5rl7";
        digitsInString(str);

        String str2 = " Hel3o W5rl7";
        System.out.println(isDigitRemoveIt(str2));
    }

    public static void digitsInString(String str){

        String strDigits = "";
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                strDigits += str.charAt(i);
//                System.out.println(str.charAt(i));
            }
        }
        int digits = Integer.parseInt(strDigits);
//        int digits = Integer.valueOf(strDigits);
        System.out.println("digits = " + digits);

    }
    public static String isDigitRemoveIt(String str){
        String strWithoutDgit = "";
        for (int i= 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                str = str.replace(str.charAt(i),'!');
            }
        }
        strWithoutDgit = str.replaceAll("!", "").trim();
        return strWithoutDgit;
    }

}
