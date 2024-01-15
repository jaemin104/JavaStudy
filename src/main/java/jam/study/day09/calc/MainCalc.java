package jam.study.day09.calc;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자 입력 : ");     //한줄 내리기 : 옵션+쉬프트+화살표아래
        int b = scanner.nextInt();

        ICalc rc = new RealCalc();

        int result = rc.add(a, b);
        System.out.println(a + " + " + b + " = " + result);

        result = rc.sub(a, b);
        System.out.println(a + " - " + b + " = " + result);

        result = rc.mul(a, b);
        System.out.println(a + " * " + b + " = " + result);

        double result1 = rc.div(a, b);
        System.out.println(a + " / " + b + " = " + result1);
    }
}
