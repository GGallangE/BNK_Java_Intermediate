package sub4;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Fork(value = 1)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class BenchmarkTest {

    @Param({"1000", "10000"})
    private int size;

    private List<Integer> list;
    private Random random;

    @Setup
    public void setup() {
        list = new ArrayList<>(size);
        random = new Random();

        // 배열 초기화
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(10_000));
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public List<Integer> testArraySortAverageTime(Blackhole blackhole){
        List<Integer> copyList = new ArrayList<>(size);
        Collections.sort(copyList);

        // Blackhole은 결과값을 '소비'해서 JIT 컴파일러가 해당 코드를 최적화하지 않도록 하기 위함
        blackhole.consume(copyList);

        return copyList;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                    .include(BenchmarkTest.class.getSimpleName())
                    .build();

        new Runner(opt).run();
    }

}
