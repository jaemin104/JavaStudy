package jam.study.day12;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = fibonacci(input);
        System.out.println(input + "에 대한 피보나치 수열 값은" + result);
        scanner.close();
    }

    public static int fibonacci(int n) {
        int f1, f2, fn = 0;

        if (n < 0) {
            System.exit(0);
        }
        if (n <= 1) {
            return n;
        }

        f1 = 0;
        f2 = 1;

        for (int i = 2; i <= n ; i++) {
            fn = f1 + f2;
            System.out.println(f1 + "+" + f2 + "=" + fn);
            f1 = f2;
            f2 = fn;

        }
        return fn;


    }
}
