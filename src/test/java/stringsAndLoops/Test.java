package stringsAndLoops;

public class Test {
    String name;
    int age;
    public void printName(){

        System.out.println("name = " + name);
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Test t = new Test();
        t.age = 33;
        t.name = "Arthur";
        int a= t.getAge();
        t.printName();
        System.out.println(t.name + "'s age is " + a +".");
    }
}
