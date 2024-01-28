package jam.study.day14;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {8,7,10},
                {0,2,2},
                {0,6,12},
                {1,4,7},
                {2,0,23},
                {3,3,31},
                {4,1,14},
                {4,5,25},
                {5,6,6},
                {6,0,52},
                {7,4,11}
        };

        printMatrix(arr);
        System.out.println();

        arr = transposeSM(arr);

        printMatrix(arr);


    }

    private static int[][] transposeSM(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] b = new int[m][n];

        for (int i = 0; i < m; i++) {
            b[i][0] = arr[i][1];
            b[i][1] = arr[i][0];
            b[i][2] = arr[i][2];
        }

//        int m = arr[0][0];
//        int n = arr[0][1];
//        int v = arr[0][2];
//
//        int[][] b = new int[11][3];
//        b[0][0] = n;
//        b[0][1] = m;
//        b[0][2] = v;
//
//        if (v > 0) {
//            int p = 1;
//            for (int i = 0; i < n; i++) {
//                for (int j = 1; j <= v; j++) {
//                    if (arr[j][1] == i) {
//                        b[p][0] = arr[j][1];
//                        b[p][1] = arr[j][0];
//                        b[p][2] = arr[j][2];
//                        p++;
//                    }
//                }
//            }
//        }

        return b;
    }

    private static void printMatrix(int[][] arr) {
        int m = arr[0][0];
        int n = arr[0][1];
        int num = arr[0][2];
        int[][] matrix = new int[m][n];

        for (int i = 1; i <= num; i++) {
            int row = arr[i][0];
            int column = arr[i][1];
            int value = arr[i][2];

            matrix[row][column] = value;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }
    }


}
