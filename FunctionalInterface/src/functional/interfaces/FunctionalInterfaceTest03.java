package functional.interfaces;

@FunctionalInterface
interface Sprint {
    public boolean equals(Object o);
    // bu method java.lang.Object sinifinda yer aldigi icin count artmiyor.
    // yani hic abstract method yokmus gibi sayiyoruz ve
    // Functinoal Interface mantigina uymuyor.
    // anotasyon compiler hatasi verir.
    // Functional Interface olamasi icin abstract bir method yazmaliyiz.

    public void make();
    // make abstract methodu ile Functional Interface mantigina uymus olduk.
}

public class FunctionalInterfaceTest03 {
}
