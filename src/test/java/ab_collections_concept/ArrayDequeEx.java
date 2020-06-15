package ab_collections_concept;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.add("a");
        arrayDeque.add("s");
        arrayDeque.addFirst("z");
        arrayDeque.addLast("m");

        System.out.println(arrayDeque);   //[z, a, s, m]

        System.out.println(arrayDeque.peek());  //z
        System.out.println(arrayDeque.peekFirst());  //z
        System.out.println(arrayDeque.peekLast());   //m

        arrayDeque.addFirst("2");
        arrayDeque.addLast("a");
        System.out.println(arrayDeque); //[2, z, a, s, m, a]

        arrayDeque.removeLast();
        System.out.println(arrayDeque);  //[2, z, a, s, m]
    }
}
