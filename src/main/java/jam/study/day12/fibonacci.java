package jam.study.day12;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }
    public static int fibonacci(int n) {
        int f1, f2, fn;


            f1 = 0;
            f2 = 1;
            System.out.println(f1);
            System.out.println(f2);
            for (int i = 3; i <= n ; i++) {
                fn = f1 + f2;
                System.out.println(fn);
                f1 = f2;
                f2 = fn;

            }
            return 0;


    }
}
