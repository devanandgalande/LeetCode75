package setMatrixZero;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] matrix = {{1, 1, 2, 1}, {3, 4, 0, 2}, {1, 3, 1, 5}};
//        int[][] matrix = {new int[4], {3,4,5,2}, {}};

        printMatrix(matrix);
        System.out.println("Set Zeros");
        setZeroes(matrix);
    }

    static public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>(), col = new HashSet<>();
        int rl = matrix.length, cl = matrix[0].length;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
//                    row.add(i); col.add(j);
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    break;
                }
            }
        }
        for (int i=0; i<rl; i++) {

        }
//        for (int r: row) {
//            matrix[r] = new int[cl];
//        }
//        for (int c: col) {
//            matrix[0][c] = new int[rl];
//        }
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