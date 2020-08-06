package stringsAndLoops;

import java.util.Arrays;

/*
Given a long String S and an Array of smaller T, write a program to check if
each string in T exist within S. (ignore case)
Input:
first line "S=" (without quotoes) followed by a long String.
Second line "T=" followed by zero or more strings separated by spaces.
Exp:
InputData
S=abcbdefcd
T=ab abc def cd abcd

Output:
true
true
true
true
false
 */
public class StringContainsArray {
    public static void main(String[] args) {
        String InputData = "S=abcbdefcd" + "\nT=ab abc def cd abcd";
//        System.out.println(InputData);

        codeHere(InputData);

    }
    public static void codeHere(String inputData){
        int indexOfT = inputData.indexOf("T");
//        System.out.println("indexOfT = " + indexOfT);

        String firstLine = inputData.substring(2, indexOfT);
//        System.out.println("firstLine = " + firstLine);

        String secondLine = inputData.substring(indexOfT+2);
//        System.out.println("secondLine = " + secondLine);

        String [] sLArr = secondLine.split(" ");
//        System.out.println("sLArr = " + Arrays.toString(sLArr));

        for (int i=0; i < sLArr.length; i++){
            if (firstLine.contains(sLArr[i])){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }

}
