package functional.interfaces;

@FunctionalInterface
interface LambdaFunction{
    void message();
}

public class LambdaTest01 {

    public static void main(String[] args) {

        //lambda asagidaki 3 sekilde de kullanabiliriz.

        LambdaFunction lambdaFunction = () -> System.out.println("hello world");
        // eger Functional Interface icerisindeki abstract method parametre almiyorsa,
        // () ifadesini kullanmaliyiz.

        lambdaFunction.message();

    }
}
