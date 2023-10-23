package practice;

public class TestStatic {
    static int n;

    public static void main(String[] args) {
        n = 9;
        System.out.println("n = " + n);
        staticVariable();
        System.out.println("n2 = " + n);
        staticVariable2();
        staticVariable();
        System.out.println("n = " + n);
        System.out.println("TestStatic.n = " + TestStatic.n);
    }


    public static void staticVariable2(){
        n=11;
        System.out.println("n = " + n);
    }
    public static void staticVariable(){
        n=10;
        System.out.println("n = " + n);
    }
}
