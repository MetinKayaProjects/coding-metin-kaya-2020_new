package codingbat.warmup2;

/*
Given a string, return the count of the number of times
that a substring length 2 appears in the string and also
as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
public class Last2String {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi")); //→ 1
        System.out.println(last2("xaxxaxaxx")); //→ 1
        System.out.println(last2("axxxaaxx")); //→ 2
        System.out.println(last2("axcxdxaaxx")); //→ 0
        System.out.println(last2("a")); //→ 0

    }

    public static int last2(String str) {
        int counter = 0;
        if (str.length() < 2) {
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equalsIgnoreCase(last2)) {
                counter++;
            }
        }
        return counter;
    }
}
