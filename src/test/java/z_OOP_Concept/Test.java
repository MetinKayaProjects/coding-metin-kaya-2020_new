package z_OOP_Concept;

public class Test {
    public static void main(String[] args) {
//        HomePage hp = new HomePage();
//        hp.clickNext();

//        NavBar hp2 = new StorePage();
//        hp2.clickNext();

        NavBar hp2 = new HomePage();
        hp2.clickNext();

        String str = "Java is fun";
        System.out.println(str.indexOf('a'));
        System.out.println(str.substring(1, 7));
        System.out.println(str.length());
        System.out.println(str.indexOf("is"));
    }
}
