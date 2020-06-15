package stringsAndLoops;

public class CountWordInAString2 {
    public static void main(String[] args) {
        String str = "java is fun. I like java and java is the best";
        int counter=0;
        String[] strArr = str.toLowerCase().split(" ");
        for (int i=0; i<strArr.length; i++){
            if (strArr[i].equalsIgnoreCase("java")){
                counter++;
            }
        }
        System.out.println("number of java in the str: " + counter);
    }
}
