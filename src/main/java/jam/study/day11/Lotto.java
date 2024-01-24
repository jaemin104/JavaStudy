package jam.study.day11;

public class Lotto {
    public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 45) + 1;
            System.out.println(num);
            for (int j = 0; j < lotto.length; j++) {
                if (num == lotto[j]) {
                    break;
                } else {
                    lotto[i] = num;
                }
            }
            i = i - 1;

        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
}
