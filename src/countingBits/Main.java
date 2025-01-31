package countingBits;

import java.util.Arrays;

/** PROBLEM
 * 338. Counting Bits
 *  https://leetcode.com/problems/counting-bits/description/?envType=problem-list-v2&envId=m7h461sc
 *  Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 *
 *
 *
 *  Example 1:
 *
 *  Input: n = 2
 *  Output: [0,1,1]
 *  Explanation:
 *  0 --> 0
 *  1 --> 1
 *  2 --> 10
 *  Example 2:
 *
 *  Input: n = 5
 *  Output: [0,1,1,2,1,2]
 *  Explanation:
 *  0 --> 0
 *  1 --> 1
 *  2 --> 10
 *  3 --> 11
 *  4 --> 100
 *  5 --> 101
 *
 *
 *  Constraints:
 *
 *  0 <= n <= 105
 *
 *
 *  Follow up:
 *
 *  It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
 *  Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 *
 */
public class Main {
    public static void main(String[] args) {
//        Input: 5
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i=0; i<=n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
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
