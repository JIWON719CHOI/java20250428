package leetCode.Minwoo;

import java.util.ArrayList;
import java.util.List;

public class p54SpiralMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}};
        System.out.println(spiralOrder(arr));
    }

    //54
    public static List<Integer> spiralOrder(int[][] matrix) {
        int numRow = matrix.length;
        int numCol = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int size = numRow + numCol - 1;

        int cnt = Math.min(numRow, numCol);
        int row = 0;
        int col = -1;

        for (int i = 0; i < cnt; i++) {
            int loop = size - 2 * i;
            int rowSize = numCol - i;
            int incDec = (i % 2 == 1) ? -1 : 1;
            for (int j = 0; j < loop; j++) {
                if (j < rowSize) col += incDec;
                else row += incDec;

                result.add(matrix[row][col]);
            }
        }

        return result;
    }
}
