package codingbat.warmup1;

import java.util.Objects;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class StartOZ {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias")); //→ "oz"
        System.out.println(startOz("bzoo")); //→ "z"
        System.out.println(startOz("oxx")); //→ "o"
        System.out.println(startOz("o")); //→ "o"
        System.out.println(startOz("z")); //→ "z"
        System.out.println(startOz("muz")); //→ "z"
    }

    public static String startOz(String str) {
      String strNew = "";
      if (str.equalsIgnoreCase("o") || str.equalsIgnoreCase("z")){
          strNew = str;
      }
        if (str.length()>=2) {
            if (str.substring(0, 2).equalsIgnoreCase("oz")) {
                strNew = "oz";
            } else if (!str.startsWith("oz") && str.substring(0, 1).equalsIgnoreCase("o") && !str.substring(1, 2).equalsIgnoreCase("z")) {
                strNew = "o";
            } else if (!str.startsWith("oz") && !str.substring(0, 1).equalsIgnoreCase("o") && str.substring(1, 2).equalsIgnoreCase("z")) {
                strNew = "z";
            }else {
                strNew = "";
            }
        }
            return strNew;
    }
}
