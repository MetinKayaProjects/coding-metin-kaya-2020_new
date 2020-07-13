package stringsAndLoops;
/*
Write a code to reverse a sentence word by word
String str = "New York";
String reversedWordByWord = "weN kroY"
 */
public class reverseWordByword2_SBuilder {
    public static void main(String[] args) {
        reversedWordByWord("New York");
    }
    public static void reversedWordByWord(String sentence){
        System.out.println("sentence = " + sentence);
        String[] strArr = sentence.split(" ");
        String reversedWbyW = "";
        for (int i=0; i < strArr.length; i++){
            StringBuilder reversed = new StringBuilder(strArr[i]).reverse();
            reversedWbyW += reversed.toString() + " ";
        }
        System.out.println("reversedWbyW = " + reversedWbyW);
    }
}
