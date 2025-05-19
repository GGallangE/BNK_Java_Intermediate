package sub2.test;

/*
출력 결과

남자 입니다.
여자 입니다.
*/

enum Gender {
    MALE, FEMALE
}
class Man {
    public void print() {
        System.out.println("남자 입니다.");
    }
}
class Woman {
    public void print() {
        System.out.println("여자 입니다.");
    }
}
public class Test09 {
    public static void main(String[] args) {
        Object human1 = makeHuman(Gender.MALE);
        Object human2 = makeHuman(Gender.FEMALE);
        if (human1 instanceof Man) { // 타입 검사
            Man man = (Man) human1; // 명시적 캐스팅
            man.print();
        }
        if (human2 instanceof Woman woman) { // 캐스팅까지 바로
            woman.print();
        }
    }
    public static Object makeHuman(Gender gender) {
        if (gender == Gender.MALE) {
            return new Man();
        } else if (gender == Gender.FEMALE) {
            return new Woman();
        }
        return null;
    }
}
