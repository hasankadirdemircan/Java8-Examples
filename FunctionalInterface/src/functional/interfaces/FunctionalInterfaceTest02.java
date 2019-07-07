package functional.interfaces;

@FunctionalInterface
interface Animal{
    public void eat(Dog dog);
}

@FunctionalInterface
interface SubInterface extends Animal{
    // icerisinde abstract method olmadigi halde Functional Interface'dir.
    // Cunku super interface'de abstract method bulunmaktadir.
    // Eger SubInterface'de de bir abstract method tanimlarsak, compiler hatasi verir.
}
class Dog{

}
public class FunctionalInterfaceTest02 {
}
