package sub4;

import java.util.ArrayList;

public class Ex6_PatternTest {
    public static void main(String[] args) {
        Object obj = "문자열 데이터 입니다.";
//        Object obj = 2;

        // 일반적인 방식
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("문자열 길이 : " + str.length());
        }else {
            System.out.println("문자열 아님.");
        }
        
        // 패턴 매칭 방식
        if (obj instanceof String str) { // 바로 캐스팅
            System.out.println("문자열 길이 : " + str.length());
        }

        printInfo("Test");
        printInfo(100);
        printInfo(new ArrayList<String>());
    }

    public static void printInfo(Object obj) {
        if(obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }else if(obj instanceof Integer num) {
            System.out.println(num * 2);
        }else {
            System.out.println(obj.getClass().getName());
        }
    }
}
