package functional.interfaces;

@FunctionalInterface
interface LambdaCalculator{
    int process(int number1, int number2);
}
public class LambdaTest04 {

    public static void main(String[] args) {

        // acik olarak ifade etmesekte kendisi sonucu return etmektedir.
        LambdaCalculator lambda01 = (number1, number2) -> number1 - number2;

        // parametre tiplerini acik sekilde ifade etmek istersek,
        LambdaCalculator lambda02 = (int number1, int number2) -> number1 + number2;

        // eger acik sekilde return etmek istersek,
        LambdaCalculator lambda03 = (number1, number2) -> {
            System.out.println("Hello Lambda Calculator");
            return number1 * number2;
        };

        System.out.println(lambda01.process(3, 5));
        System.out.println(lambda02.process(3, 5));
        System.out.println(lambda03.process(3, 5));
    }
}
