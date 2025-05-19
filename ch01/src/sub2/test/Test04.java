package sub2.test;

/*
출력 결과

2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97
2부터 100 사이의 소수의 개수 : 25개
 */

public class Test04 {
    public static void main(String[] args) {
        int index;
        int primes = 0;
        for (int i = 2; i < 100; i++) {
            for (index = 2; index < i; index++) {
                if (i % index == 0) {
                    break;
                }
            }
            if (i == index) {
                primes++;
                System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
            }
        }
        System.out.printf("\n2부터 100 사이의 소수의 개수 : %d개", primes);
    }
}