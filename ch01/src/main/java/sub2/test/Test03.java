package sub2.test;

import java.util.Scanner;

/*
출력 결과

숫자 입력 : 10
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5,040
8! = 40,320
9! = 362,880
10! = 3,628,800
1! + 2! + ... + 10! = 4,037,913
 */

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 2; j <= i; j++) {
                fact *= j;
            }
            sum += fact;
            System.out.printf("%2d! = %,10d\n", i, fact);
        }
        System.out.printf("1! + 2! + ... + %d! = %,d\n", n, sum);
    }
}
