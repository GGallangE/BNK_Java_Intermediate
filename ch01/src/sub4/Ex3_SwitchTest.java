package sub4;

enum DayOfWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
}

public class Ex3_SwitchTest {

    public static void main(String[] args) {

        //일반 switch
        DayOfWeek day = DayOfWeek.Monday;
        switch (day) {
            case Monday:
                System.out.println("Monday");
                break;
            case Saturday:
                System.out.println("주말");
                break;
        }

        // 새로운 switch

        String dayName = switch (day){
            case Monday -> "월요일";
            case Tuesday -> "화요일";
            case Wednesday -> "수요일";
            case Thursday -> "목요일";
            case Friday -> "금요일";
            case Saturday -> "토요일";
            case Sunday -> "일요일";
        };

        System.out.println(dayName);
    }
}
