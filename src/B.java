public class B extends A {
    public B() {
        super();
        method();
        System.out.println("Constructor B");
    }

    void method(){
        System.out.println("Default method B");
    }

    static void method1(){
        System.out.println("Static method B");
    }
}
