package ab_collections_concept;

import java.util.PriorityQueue;


public class QueueEx {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        System.out.println(queue.peek()); //null
        // if we use queue.element() -> gives exception
        queue.add("java");
        System.out.println(queue);  //[java]
        queue.offer("a");
        System.out.println(queue); //[a, java]
       // queue.add(null);
        // queue.offer(null);

        System.out.println(queue.element()); //a
        System.out.println(queue.remove()); //a

        System.out.println(queue); //[java]
        System.out.println(queue.remove()); //java


    }
}
