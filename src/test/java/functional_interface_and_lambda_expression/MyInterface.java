package functional_interface_and_lambda_expression;

@FunctionalInterface
public interface MyInterface<T> {

    void functionExmple(T a);  //FunctionalInterface annotation allows only one abstract method

}
