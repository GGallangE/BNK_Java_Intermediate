package sub4;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamTest {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        int sum1 = list.stream()
                .map((n)->n*n)
                .reduce(0, Integer::sum);

        System.out.println("sum1 = " + sum1);

        int sum2 = list.parallelStream()
                .map((n)->n*n)
                .reduce(0, Integer::sum);

        System.out.println("sum2 = " + sum2);

    }
}