package practice;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strArr = {"flower", "flow", "flight", "flu"};
        String[] strArr2 = {"Strong", "Strategy", "Stratosphere"};
        String[] strArr3 = {"abc", "def", "ghi"};

        LongestCommonPrefix result = new LongestCommonPrefix();  // method is not static, so we call it with an object

        System.out.println(result.findLongestCommonPrefix(strArr));
//        System.out.println(result.findLongestCommonPrefix(strArr2));
//        System.out.println(result.findLongestCommonPrefix(strArr3));
    }

    private String findLongestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String shortestStr = strs[0];
        for (String s : strs) {
            if (s.length() < shortestStr.length()) {
                shortestStr = s;
            }
        }
        System.out.println("shortestStr = " + shortestStr);

        for (int i = 0; i < shortestStr.length(); i++) {
            char c = shortestStr.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
//                    return shortestStr.substring(0, i);
                    shortestStr = shortestStr.substring(0, i); //flu (0,2)-->0, 1 => fl
                }
            }
        }

//        for (int i = 0; i < shortestStr.length(); i++) {
//            char c = shortestStr.charAt(i);
//            for (int j =0; j < strs.length; j++) {
//                if (strs[j].charAt(i) != c) {
////                    return shortestStr.substring(0, i);
//                    shortestStr = shortestStr.substring(0, i); //flu (0,2)-->0, 1 => fl
//                }
//            }
//        }

        return shortestStr;
    }
}
