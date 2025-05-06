package oppa;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 2, 2)));
//        System.out.println(Arrays.deepToString(matrixReshape(mat, 2, 4)));

    }

    //566
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int oriR = mat.length;
        int oriC = mat[0].length;
        int[][] out = new int[r][c];
        if(oriR * oriC != r * c) return mat;


        int newR = 0;
        int newC = 0;
        for(int i=0; i<oriR; i++) {
            for(int j=0; j<oriC; j++) {
                out[newR][newC] = mat[i][j];

                newC++;
                if(newC == c) {
                    newC =0;
                    newR++;
                }
            }
        }

        return out;
    }
}
