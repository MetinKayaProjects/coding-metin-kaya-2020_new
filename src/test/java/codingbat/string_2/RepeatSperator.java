package codingbat.string_2;

/*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 4) → "WordXWordXWordXWord"
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSperator {
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 4));
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
        System.out.println(repeatSeparator("AAA", "", 0));


    }

    public static String repeatSeparator(String word, String sep, int count) {
        String str = word;
        if (count == 1){
            str = word;
        } else if (count >= 2) {
            for (int i = 1; i < count; i++) {
                str += sep + word;
            }
        }else{
            str = "";
        }
        return str;
    }
}
