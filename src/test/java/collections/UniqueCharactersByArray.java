package collections;

import java.util.Arrays;

/*
    Task - 4  day6
    Create a method that will accept a String and return a version
    that has only the unique characters.
     Ex: unique("AAABCCCDDEFFS") ==> ”BES"
     unique("AAABCCCDDEFFSGTTJB") ==> ESGJ
     */
public class UniqueCharactersByArray {
    public static void main(String[] args) {
        unique("AAABCCCDDEFFS");
    }

    public static void unique(String str) {
        System.out.println("str = " + str);

        String[] strArr = str.split("");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        String strUnique = "";
        for (int i = 0; i < strArr.length; i++) {
            int count = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    count++;

                }
            }
            if (count == 1) {
                strUnique += strArr[i];
            }
        }
        System.out.println("strUnique = " + strUnique);
    }
}
