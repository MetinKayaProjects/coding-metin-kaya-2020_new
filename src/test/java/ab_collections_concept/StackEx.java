package ab_collections_concept;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
//  NOT: add() ve push() ikisi de stacList'e item ekler.
//       Ancak add, List'den gelir. Tavsiye edilen push() kullanilmasidir.
        Stack<String> stack = new Stack<String>();
        stack.add("a");
        System.out.println("stack = " + stack); // [a]
        stack.add("Steve");
        stack.push("Horse");
        System.out.println("stack = " + stack);  // [a, Steve, Horse]
        stack.push("b");
        stack.push("c");  //listeye add yapar
        stack.push(null);
        stack.push("d");
        System.out.println("stack = " + stack);  //stack = [a, Steve, Horse, b, c, null, d]
        stack.remove(null);
        System.out.println("stack = " + stack);  //[a, Steve, Horse, b, c, d]

        System.out.println("stack.pop(): " + stack.pop()); //d EN SON KARAKTERI return eder, listeden de REMOVE!!!

        System.out.println("stack after pop()= " + stack);    //[a, Steve, Horse, b, c]

        System.out.println("stack.pop() = " + stack.pop());  //c return and c is romoved from the list
        System.out.println("stack = " + stack);         // [a, Steve, Horse, b]

        System.out.println("stack.peek() = " + stack.peek()); //b; son item'i return eder ama SILMEZ!
        System.out.println("stack = " + stack);          //[a, Steve, Horse, b]

        System.out.println("stack.lastElement() = " + stack.lastElement()); //b; son item'i return eder ama SILMEZ!
        System.out.println("stack = " + stack);         //[a, Steve, Horse, b]

        System.out.println("stack.firstElement() = " + stack.firstElement());//a; ilk item'i return eder ama SILMEZ!
        System.out.println("stack = " + stack);         //[a, Steve, Horse, b]

        System.out.println("stack.push(Cat) = " + stack.push("Cat")); //Cat; listeye Cat'i ekler
        System.out.println("stack = " + stack);  //stack = [a, Steve, Horse, b, Cat]

        System.out.println("stack.lastElement() = " + stack.lastElement());  //Cat; last elementi verir; listeden silmez
        System.out.println("stack = " + stack);    //[a, Steve, Horse, b, Cat]

        System.out.println("stack.firstElement() = " + stack.firstElement());//a; ilk elementi verir; listeden silmez
        System.out.println("stack = " + stack);   //[a, Steve, Horse, b, Cat]

        System.out.println("stack.elementAt(0) = " + stack.elementAt(0));  //a  <- //[a, Steve, Horse, b, Cat]
        System.out.println("stack.get(3) = " + stack.get(3));                   // b  < - //[a, Steve, Horse, b, Cat]
//
        System.out.println("stack.remove(1) = " + stack.remove(1));  //Steve - >  is removed
        System.out.println("stack = " + stack);                           //[a, Horse, b, Cat]

        System.out.println("stack.remove(Horse) = " + stack.remove("Horse")); //true -> Horse is removed
        System.out.println("stack = " + stack);  //[a, b, Cat]


        stack.set(0, "Dog");   //index 0'a "Dog" ekle
        System.out.println("stack = " + stack);  //[Dog, b, Cat]    -> a'nin yerine Dog geldi.


    }
}
