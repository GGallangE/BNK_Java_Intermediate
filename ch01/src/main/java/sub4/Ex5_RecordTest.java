package sub4;

import javax.xml.namespace.QName;

class User1{
    private String name;
    private int age;

    public User1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
            ", age=" + age +
                '}';
    }
}

record User2(String name, int age){

}



public class Ex5_RecordTest {
    public static void main(String[] args) {
        User1 user1 = new User1("김유신", 23);
        User1 user3 = new User1("김유신", 23);

        System.out.println(user1);
        System.out.println("이름 : " + user1.getName());
        System.out.println("나이 : " + user1.getAge());

        System.out.println(user1 == user3);
        System.out.println(user1.equals(user3));

        User2 user2 = new User2("김춘추", 21);
        User2 user4 = new User2("김춘추", 21);
        System.out.println(user2);
        System.out.println("이름 : " + user2.name());
        System.out.println("나이 : " + user2.age());

        System.out.println(user2 == user4);
        System.out.println(user2.equals(user4));
    }
}
