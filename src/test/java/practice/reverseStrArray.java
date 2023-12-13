package practice;

import java.util.Arrays;

public class reverseStrArray {
    public static void main(String[] args) {
        String str = "Java is fun!"; // avaJ si !nuf
        String str2 = "New York"; //


        System.out.println(Arrays.toString(eachReversed(str)));
        System.out.println(Arrays.toString(eachReversed(str2)));


    }
    public static String[] eachReversed(String str){
        String[] strings = str.split(" ");
//        System.out.println("strings[] :"+ Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reversed(strings[i]);
        }
        return strings;
    }

    public static String reversed(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

}
