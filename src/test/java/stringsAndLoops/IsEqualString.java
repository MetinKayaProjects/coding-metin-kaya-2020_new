package stringsAndLoops;

public class IsEqualString {
    public static void main(String[] args) {

        System.out.println( isEgualString("Monday", "MONday"));
        System.out.println( isEgualString("Monday", "Tuesday"));
    /*
    Monday - MONday ==> True
    Monday - Tuesday == False
     */

    }

    public static Boolean isEgualString(String str1, String str2){

        Boolean isEqual = (str1.equalsIgnoreCase(str2)) ? true : false;
//        Boolean isEqual = (str1.toLowerCase().equals(str2.toLowerCase())) ? true : false;

        return isEqual;
    }


}
