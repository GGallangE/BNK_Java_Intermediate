package sub4;

interface Worker {
    void work();
    void eat();
    void sleep();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // 로봇은 먹지 않지만 인터페이스 구현을 위해 빈 메서드 또는 예외 처리 필요
    }

    @Override
    public void sleep() {
        // 로봇은 잠들지 않지만 인터페이스 구현을 위해 빈 메서드 또는 예외 처리 필요
    }
}

public class Ex4_ISP {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.eat();
        human.sleep();
        human.work();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
