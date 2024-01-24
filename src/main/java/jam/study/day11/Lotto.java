package jam.study.day11;

public class Lotto {
    public static void main(String[] args) {

        int[] lotto = new int[6];

    l1:    for (int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 45) + 1;
            System.out.print(num + " ");
            for (int j = 0; j < i; j++) {
                if (num == lotto[j]) {
                    i--;
                    continue l1;
                }

            }
            lotto[i] = num;

        }
        System.out.println();

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
}
