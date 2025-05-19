package sub3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Target {
    public static String staticValue = "초기화 전";

    static {
        System.out.println("Target 클래스의 static 블럭 실행...");
        staticValue = "초기화 완료";
    }

    public Target() {
        System.out.println("Target ");
    }

    public static void hello() {
        System.out.println("hello static 값 : " + staticValue);
    }

    public static void welcome() {
        System.out.println("welcome static 값 : " + staticValue);
    }
}

public class ClassloaderTest {
    public static void main(String[] args) throws Exception {

        // 로딩 단계
        System.out.println("로딩 시작...");

        ClassLoader classLoader = ClassloaderTest.class.getClassLoader();
        Class<?> loadedClass = classLoader.loadClass("sub3.Target");

        System.out.println("로딩된 클래스 : " + loadedClass.getName());

        // 링킹 단계
        System.out.println("링킹 시작...");
        Field staticField = loadedClass.getDeclaredField("staticValue");
        String value = (String) staticField.get(null);
        System.out.println("staticValue : " + value);

        Method helloMethod = loadedClass.getDeclaredMethod("hello");
        helloMethod.invoke(null);

        // 인스턴스 생성
        Object instance = loadedClass.getDeclaredConstructor().newInstance();
        Target target = (Target) instance;
        target.welcome();

        Method welcomeMethod = target.getClass().getDeclaredMethod("welcome");
        welcomeMethod.invoke(instance);

    }
}
