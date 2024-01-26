package jam.study.day13;

public class TwoDim {
    public static void main(String[] args) {
        int[][] sale = new int[][] {{63, 84, 140, 130},
                                    {157, 209, 251, 312}};

        for (int i = 0; i < 2; i++) {
            System.out.println(2023+i);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d/4분기 : sale[%d][%d] = %d \n", j + 1, i, j, sale[i][j]);
            }

        }
    }
}
