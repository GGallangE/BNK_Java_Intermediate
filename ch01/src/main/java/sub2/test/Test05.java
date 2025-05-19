package sub2.test;

/*
출력 결과

i = 1, PI = 4.000000
i = 3, PI = 2.666667
i = 5, PI = 3.466667
i = 7, PI = 2.895238
i = 9, PI = 3.339683
...
i = 9999991, PI = 3.141592
i = 9999993, PI = 3.141593
i = 9999995, PI = 3.141592
i = 9999997, PI = 3.141593
i = 9999999, PI = 3.141592
 */

public class Test05 {
    public static void main(String[] args) {
        boolean sign = false;
        double pi = 0;
        for (int i = 1; i <= 10000000 ; i += 2) {
            if (!sign) {
                pi += 1.0 / i;
                sign = true;
            } else {
                pi -= 1.0 / i;
                sign = false;
            }
            System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
        }
    }
}
