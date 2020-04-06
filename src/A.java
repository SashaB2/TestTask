import java.sql.SQLOutput;

public class A {

    public A() {
        System.out.println("Constructor A");
        method();
    }

    void method(){
        System.out.println("Default method A");
    }

    static void method1(){
        System.out.println("Static method A");
    }
}
