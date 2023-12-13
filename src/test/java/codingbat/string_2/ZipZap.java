package codingbat.string_2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

zipZap("zzp") → "zp"
zipZap("azbcpzpp") → "azbcpzp"
 */
public class ZipZap {
    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
        System.out.println(zipZap("zzp"));
        System.out.println(zipZap("azbcpzpp"));
        System.out.println(zipZap("az"));
    }

    public static String zipZap(String str) {
        String result = "";
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i+2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i +=2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
