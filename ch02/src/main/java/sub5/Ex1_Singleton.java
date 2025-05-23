package sub5;

class Logger {
    // 유일한 인스턴스를 저장할 정적변수
    private static Logger instance = new Logger();

    // 외부로 싱글톤 객체를 제공
    public static Logger getInstance() {
        return instance;
    }

    // 외부에서 로거 객체 생성 방지
    private Logger() {}

    public void log(String msg) {
        System.out.println("[LOG]" + msg);
    }
}

public class Ex1_Singleton {

    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        //Logger log2 = new Logger();

        log1.log("Hello World");
        log1.log("Welcome Busan Bank");


    }
}