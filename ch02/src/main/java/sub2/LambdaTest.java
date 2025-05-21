package sub2;

@FunctionalInterface
interface A{
    int method(int a, int b);
}

interface B{
    void method(double a);
}

interface C{
    boolean method();
}

interface D{
    void method();
}

interface E{
    double method(double a);
}


public class LambdaTest {
    public static void main(String[] args) {
        A a1 = (a, b) -> a + b; // 중괄호 빠지면 무조건 return -> a + b 는 return
        B b1 = (a) -> System.out.println("a : " + a);
        B b2 = System.out::println; // 메서드 참조 연산자 (람다식)
        C c1 = () -> true;
        C c2 = () -> false;
        D d1 = () -> {
            System.out.println("d1 실행...");
        };
        D d2 = () -> System.out.println("d2 실행...");
        E e1 = Math::ceil;
        E e2 = Math::floor;
        E e3 = Math::round;

        int r1 = a1.method(3, 4);
        int r2 = a1.method(4, 5);
        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);

        b1.method(1.0);
        b2.method(2.1);

        boolean r3 = c1.method();
        boolean r4 = c2.method();
        System.out.println("r3 : " + r3);
        System.out.println("r4 : " + r4);

        d1.method();
        d2.method();

        double r5 = e1.method(1.2);
        double r6 = e2.method(1.8);
        double r7 = e3.method(1.5);

        System.out.println("r5 : " + r5);
        System.out.println("r6 : " + r6);
        System.out.println("r7 : " + r7);

    }
}
