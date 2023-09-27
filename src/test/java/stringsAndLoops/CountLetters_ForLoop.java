package stringsAndLoops;

public class CountLetters_ForLoop {
    /*
Given any String print out how many times each character is found in the String
Ex: java
j – 1
a – 2
v – 1
 */
    public static void main(String[] args) {

        String str = "java is my favorite program";
        String check = "";

        for (int i = 0; i < str.length(); i++) {
//
            if (!check.contains(str.charAt(i) + "")) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }

                if(count > 1) { // print the letter if it is repeated more than 1
                    System.out.println(str.charAt(i) + " - " + count);
                    check += str.charAt(i);
                }
            }
        }
    }
}