package sub3;

import java.util.LinkedList;
import java.util.List;

public class ConcurrentLinkedQueueTest {
    public static void main(String[] args) throws InterruptedException {

        // 스레드에 안전하지 않은 컬렉션
        List<String> list = new LinkedList<>();
    }
}
