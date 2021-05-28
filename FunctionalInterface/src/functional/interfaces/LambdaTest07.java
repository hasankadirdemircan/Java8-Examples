package functional.interfaces;

@FunctionalInterface
interface FuncInterface {
    void eat();
}

class Cat {

}

public class LambdaTest07 {

    public static void main(String[] args) {
        FuncInterface lambda01 = () -> new Cat();
    }
}
