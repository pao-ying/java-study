package com.example.code.solution1277;

/*
* 按照本来的思路就是对于 (i, j), 我们查看(i - 1, j - 1)是否是正方形，
* 如果 (i-1, j-1)是正方形，则获得他的大小m。那么我们的工作就是遍历(m-i, i-1)和(m-j, j-1)，看他们是不是1，
* 是的话(i,j)位置的正方形大小就是 m + 1。
* 但是该方法的复杂度较高，多次遍历。
* 其实，之前只观察了(i-1,j-1)是不是正方形，对于(m-i,i-1)和(m-j,j-1)都是直接遍历，事实上我们可以同时观察
* (i-1,j)和(i,j-1)正方形的长度，以此来获得1的长度，最后将三个正方形对比，取最小的+1即可。
* dp[i, j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1
* */
public class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // 如果是0直接continue
                if (matrix[i][j] == 0) continue;
                if (i == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (j == 0) {
                    dp[i][j] = matrix[i][j];
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j - 1],
                            Math.min(
                                    dp[i - 1][j],
                                    dp[i][j - 1]
                            )
                    ) + 1;
                }
                ans += dp[i][j];
            }
        }
        return ans;
    }
}
