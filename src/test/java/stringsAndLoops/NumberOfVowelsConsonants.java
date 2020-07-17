package stringsAndLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Count number of Vowels & Consonants in a given word
public class NumberOfVowelsConsonants {
    public static void main(String[] args) {
        System.out.println(numbers("Hello world"));
    }

    public static String numbers(String word) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> consonant = new ArrayList<>();
        int countVowels = 0;
        int countConsonant = 0;

        System.out.println("word = " + word);
        word = word.replace(" ", "").trim();
        System.out.println("word after trim = " + word);

        for (int i = 'a'; i < 'z'; i++) {
            if (!vowels.contains(i)) {
                consonant.add((char) i);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                countVowels++;
            }
            else  {
                countConsonant++;
            }
        }


        return "number of Vowels: " + countVowels + "\n number of consonant: " + countConsonant;
    }
}
