package collections;

/*
   Create a method that will accept a String and returns
           a version that removes duplicate instances of any character
           Ex: removeDup("AAABBBCCCD") ==> ABCD
           */
public class RemoveDuplicates2 {
    public static void main(String[] args) {

        uniqueChar("AAABBBCCCD");
    }

    public static void uniqueChar(String str) {
        String unique = "";
        String[] strArr = str.split("");

        for (String s : strArr) {
            if (!unique.contains(s)) {
                unique += s;
            }
        }
        System.out.println("unique = " + unique);
    }
}
