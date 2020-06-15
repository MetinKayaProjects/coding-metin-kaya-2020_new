package ab_collections_concept;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            String s = "java";

            System.out.println(s.substring(1));
//            System.out.println(s.substring(1,8));  // bu aktif olsaydi catch (StringIndexOutOfBoundsException e) calisirdi
            System.out.println(4/0);            //bu ornege gore catch (ArithmeticException e) calisir. Ilk exception calisir
            System.out.println(s.substring(1,8));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("finally block");   //her halikarda en son ve bir kez calisir
        }
        }


}
