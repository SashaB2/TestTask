public class C extends B {

    public C() {
        super();
        System.out.println("Constructor C");
        method1();
        method();
    }

    void method(){
        System.out.println("Default method C");
    }

    static void method1(){
        System.out.println("Static method C");
    }
}
