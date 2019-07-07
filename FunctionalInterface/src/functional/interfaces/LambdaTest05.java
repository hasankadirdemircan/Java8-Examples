package functional.interfaces;

@FunctionalInterface
interface LambdaFunctionV2{
    String intKind(int number);
}
public class LambdaTest05 {

    public static void main(String[] args) {
        LambdaFunctionV2 lambda01 =
                (int number) -> {
            if( number % 2 == 0) return "even";
            else return "odd";

        };
        // iki islemde ayni isi yapmaktadir.
        LambdaFunctionV2 lambda02 =
                (int number) -> {
                    if( number % 2 == 0){
                        return "even";
                    }
                    else{
                        return "odd";
                    }
                };

        System.out.println(lambda01.intKind(20));
        System.out.println(lambda01.intKind(21));
    }
}
