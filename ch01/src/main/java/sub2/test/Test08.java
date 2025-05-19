package sub2.test;

/*
출력 결과

이름 : 김유신
나이 : 24
이름 : 강감찬
나이 : 26
학교 : 부경대
이름 : 이순신
나이 : 27
학교 : 부산대
직업 : 개발자
 */

class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
    }
}
class Student extends Person {
    protected String school;
    public Student(String name, int age, String school) {
        super(name, age); // 부모 초기화
        this.school = school;
    }
    public void show() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("학교 : " + this.school);
    }
}
class SalaryStudent extends Student {
    private String job;
    public SalaryStudent(String name, int age, String school, String job) {
        super(name, age, school); // 부모 초기화
        this.job = job;
    }

    public void show() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("학교 : " + this.school);
        System.out.println("직업 : " + this.job);
    }
}
public class Test08 {
    public static void main(String[] args) {
        Person kim = new Person("김유신", 24);
        Student kang = new Student("강감찬", 26, "부경대");
        SalaryStudent lee = new SalaryStudent("이순신", 27, "부산대", "개발자");
        Person[] people = { kim, kang, lee };
        for (Person person : people) {
            person.show();
        }
    }
}
