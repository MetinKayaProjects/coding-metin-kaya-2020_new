package codingbat.string_2;

/*
Return a version of the given string,
where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
starOut("sm*eil*ly") → "siy"
 */
public class StarOut {
    public static void main(String[] args) {

        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
        System.out.println(starOut("sm*eil*ly"));

    }

    public static String starOut(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '*') continue;
//            if (i > 0 && str.charAt(i - 1) == '*') continue;
//            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
//
//            sb.append(str.charAt(i));
//        }
//        return sb.toString();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i -1) == '*') continue;
            if (i < str.length()-1 && str.charAt(i+1) == '*') continue;

            result += str.charAt(i);

        }
        return result;
    }

}
