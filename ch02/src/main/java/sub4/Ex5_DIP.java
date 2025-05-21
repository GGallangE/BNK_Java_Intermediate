package sub4;

class LightBulb {
    public void turnOn() {
        System.out.println("전구 불이 켜졌습니다.");
    }

    public void turnOff() {
        System.out.println("전구 불이 꺼졌습니다.");
    }
}

class Switch {
    private LightBulb bulb; // 구체적인 LightBulb 클래스에 직접 의존

    public Switch() {
        this.bulb = new LightBulb();
    }

    public void operate() {
        // 스위치를 조작하는 로직 (예: 현재 상태에 따라 turnOn 또는 turnOff 호출)
        bulb.turnOn();
    }
}

public class Ex5_DIP {
    public static void main(String[] args) {
        Switch switchButton = new Switch();
        switchButton.operate();
    }
}
