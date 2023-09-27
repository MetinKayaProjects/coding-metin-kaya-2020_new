package stringsAndLoops;

public class StringBuilderAndBuffer {

    public static void main(String[] args) {

        String str = "Java is my life";
        getStrBuilder(str);
        System.out.println(getStringReverse(str));;
        String reReversed = getStringReverse(str);
        System.out.println("reReversed = " + getStringReverse(reReversed));
    }

    public static void getStrBuilder(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        System.out.println("strBuilder = " + strBuilder);
        System.out.println("strBuilder.reverse().toString() = " + strBuilder.reverse());

        strBuilder.append(" - " + 16);
        System.out.println("strBuilder append= " + strBuilder);

    }

    public static String getStringReverse(String str){

        String reversed = "";

        System.out.println("str = " + str);

        for (int i = str.length()-1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
//        System.out.println("reversed = " + reversed);
        return reversed;
    }



}
