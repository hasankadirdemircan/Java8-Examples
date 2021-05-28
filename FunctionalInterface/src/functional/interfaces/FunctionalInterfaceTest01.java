package functional.interfaces;

@FunctionalInterface
interface Interfae {
    public void abstractMethod();
    // 1 tane abstract method olmali.
    // 1 den az veya cok olursa compiler hatasi verir.
    // ve @FunctionalInterface anotasyonunu kaldirmamiz gerekir.
}

public class FunctionalInterfaceTest01 {
}
