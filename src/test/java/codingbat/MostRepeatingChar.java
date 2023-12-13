package codingbat;
import java.util.*;
/*
Write a method to print the maximum occurring character and count in the input string e.g., if input string is “function” then function should return ‘n’.
  <char>:<count>
  Example: testings
  t:2
  Example:function
  n:2
*/
public class MostRepeatingChar {
        public static void main(String[] args) {
        // ArrayList<String> strings = new ArrayList<String>();
        // strings.add("Hello, World!");
        // strings.add("Welcome to CoderPad.");
        // strings.add("This pad is running Java " + Runtime.version().feature());

        // for (String string : strings) {
        //   System.out.println(string);
        String str = "Java is my main language";
        System.out.println("maxAccuring(str) = " + maxAccuring(str));

        System.out.println("maxAccuring2(str) = " + maxAccuring2(str));
    }

    public static Map<String, Integer> maxAccuring(String str){

        Map<Character, Integer> map = new HashMap<>();
        int charCount = Integer.MIN_VALUE;
        String repeatedChar = "";
        char[] strArr = str.toCharArray();
        for(char ch : strArr ){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }   else{
                map.put(ch, map.get(ch) + 1);
            }
            if(charCount < map.get(ch)){
                charCount = map.get(ch);
                repeatedChar = String.valueOf(ch);
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put(repeatedChar, charCount);

        return result;
    }

    public static Map<String, Integer> maxAccuring2(String str){
        Map<Character, Integer> map = new HashMap<>();
        int maxNumOfChar = Integer.MIN_VALUE;
        String repeatedChar = "";
//        str = str.replace(" ", "").toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            if (maxNumOfChar < map.get(str.charAt(i))){
                maxNumOfChar = map.get(str.charAt(i));
                repeatedChar = String.valueOf(str.charAt(i));
            }
        }
        Map<String, Integer> maxsRepeatedChar = new HashMap<>();
        maxsRepeatedChar.put(repeatedChar, maxNumOfChar);

        return maxsRepeatedChar;
    }

}

