package codingbat;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A");
            System.out.println(hello());
            System.out.println("B");
//            throw new Exception();
        }catch (Exception e){
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
    }

    public static String hello() throws Exception{
        try {
            System.out.println("1");
            throw new Exception();

        }
        catch (Exception e){
            System.out.println("2");
            return "X";
        }
        finally {
            System.out.println("3");
        }
    }
}
