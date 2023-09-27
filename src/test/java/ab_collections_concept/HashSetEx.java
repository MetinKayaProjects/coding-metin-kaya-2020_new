package ab_collections_concept;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("z");
        set.add("y");
        set.add(null);
        set.add("z");
        set.add("80");
        set.add("60");
        set.add("/");
        set.add(null);
        set.add("z");
        set.add("a");
        set.add("m");
        set.add("20");
        set.add("a");

        System.out.println(set);
        set.remove("z");
        System.out.println(set);

        System.out.println("---------TreeSet------------");
// TreeSet doesn't allow null
        set.remove(null);  //first remove the null element from the Set
//        SortedSet<String> setSorted = new TreeSet<>(set);
        Set<String> setSorted = new TreeSet<>(set);


        System.out.println(setSorted);

    }
}
