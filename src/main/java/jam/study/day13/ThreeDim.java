package jam.study.day13;

public class ThreeDim {
    public static void main(String[] args) {
        int[][][] sale = new int[][][] {
                {
                    {63, 84, 140, 130},
                    {157, 209, 251, 312},
                    {10,20,30,40},
                    {45,56,67,78}
                },
                {
                    {1,2,3,4},
                    {5,6,7,8},
                    {11,22,100,44},
                    {45,56,67,78}
                },
                {
                    {1,2,3,4},
                    {5,6,7,8},
                    {11,22,33,44},
                    {45,56,67,78}
                }
        };

        int[][][] arr = {
                {
                        {1,2,3},
                        {2,3,4},
                        {2,5,6}
                },
                {
                        {1,2,3},
                        {2,3,4},
                        {2,5,6}
                },
                {
                        {1,2,3},
                        {2,3,4},
                        {2,5,6}
                }
        };

        System.out.println(sale.length);
        System.out.println(sale[0].length);
        System.out.println(sale[0][0].length);
        System.out.println(sale[1][2][2]);
        sale[2][3][3] = 1000;


        for (int i = 0; i < sale.length; i++) {
            System.out.println(i+1+"팀==================================");
            for (int j = 0; j < sale[0].length; j++) {
                System.out.println(j+2023+"--------------------------------");
                for (int k = 0; k < sale[0][0].length; k++) {
                    System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d \n", k + 1, i, j, k, sale[i][j][k]);
                }
            }

        }
    }
}
