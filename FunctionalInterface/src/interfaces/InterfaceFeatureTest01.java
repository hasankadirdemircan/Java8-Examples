package interfaces;

interface CoolInterface{
    public static void staticMethod(){
        System.out.println("static method.");
    }
    // static methodlar,
    // private methodlar tanimlanabiliyor.(java 9 da geldi.)
      private static void staticTestMethod2(){
      System.out.println("private static method.");
    }
}
public class InterfaceFeatureTest01 {

    public static void main(String[] args) {
        CoolInterface.staticMethod();
    }
}
