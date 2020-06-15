package ab_collections_concept;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.addFirst("z");
        list.addLast(null);
        list.add(null);

        System.out.println(list);   //[z, a, b, null, null]

    }
}
