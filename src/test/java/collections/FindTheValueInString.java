package collections;

import java.util.Arrays;

public class FindTheValueInString {

    public static void main(String[] args) {
        String str = "Total amount of the Car is $40,000.";

        valueInString(str);
    }

    public static void valueInString(String str){
        String [] strArr = str.split(" ");
        String strValue = "";
        int value = 0;

        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].startsWith("$")){
                strValue += strArr[i].replace("$", "")
                        .replace(".", "")
                        .replace(",","")
                        .trim();
            }
            
        }
        value = Integer.valueOf(strValue);

        System.out.println("value = " + value);

//        return  value;
    }

}
