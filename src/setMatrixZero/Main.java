package setMatrixZero;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] matrix = {{1,2,3,4}, {5,0,7,8}, {0,10,11,12}, {13,14,15,0}};

        printMatrix(matrix);
        System.out.println("Set Zeros");
        setZeroes(matrix);
    }

    static public void setZeroes(int[][] matrix) {
        boolean fr = false, fc = false;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i==0) fr = true;
                    if (j==0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (fr) {
            Arrays.fill(matrix[0], 0);
        }
        if (fc) {
            for (int i=0; i<matrix.length; i++) matrix[i][0]=0;
        }

        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

/** PROBLEM
 73. Set Matrix Zeroes
 https://leetcode.com/problems/set-matrix-zeroes/description/?envType=problem-list-v2&envId=m7h461sc
 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

 You must do it in place.



 Example 1:


 Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 Output: [[1,0,1],[0,0,0],[1,0,1]]
 Example 2:


 Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 Constraints:

 m == matrix.length
 n == matrix[0].length
 1 <= m, n <= 200
 -231 <= matrix[i][j] <= 231 - 1


 Follow up:

 A straightforward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?
 */