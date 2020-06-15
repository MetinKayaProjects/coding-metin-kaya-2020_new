package ab_collections_concept;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();
        vector.add("a");
        vector.add(null);
        vector.add("e");
        vector.add("b");

        System.out.println(vector);

    }
}
