package leetCode;

import java.util.*;

public class FindDiagonalOrder498 {
    public static void main(String[] args) {
        int[][] arr = {{2, 3}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    //498
    public static int[] findDiagonalOrder(int[][] mat) {
        //[0,0],[0,1],[1,0],[2,0],[1,1],[0,2],[1,2],[2,1], [2,2]
        int numRow = mat.length;
        int numCol = mat[0].length;
        int[] out = new int[numRow * numCol];

        int numIter = numRow + numCol - 2;
        int idx = 0;

        for (int i = 0; i <= numIter; i++) {

            int maxStart = (i % 2 == 0) ? numRow : numCol;
            int start = Math.min(i, maxStart - 1);

            for (int j = start; j >= 0; j--) {
                int r = j;
                int c = i - j;

                if (i % 2 == 0) {
                    if (c > numCol - 1) break;
                    out[idx] = mat[r][c];
                } else {
                    if (c > numRow - 1) break;
                    out[idx] = mat[c][r];
                }
                idx++;
            }
        }
        return out;

    }
}
