package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl c = new InterfaceCImpl();

        InterfaceA a = c;
        a.methodA();
        InterfaceB b = c;
        b.methodB();

        InterfaceC c1 = c;
        c1.methodA();
        c1.methodB();
        c1.methodC();
    }
}