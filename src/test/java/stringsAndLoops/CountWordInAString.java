package stringsAndLoops;

public class CountWordInAString {

    /*
    Write a program that will count how many times “java” is found in any given String
     */
    public static void main(String[] args) {
        String str = "java is fun. I like java and java is the best";
        System.out.println("number of java in this string: " + countJava(str));
    }
    public static int countJava(String str){
     int counter = 0;
     for (int i=0; i<str.length()-3; i++){
         if (str.substring(i,i+4).equalsIgnoreCase("java")){
             counter++;
         }
    }
        return counter;
    }
}
