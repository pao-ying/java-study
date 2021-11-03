package com.example.code.solution72;

/*
* 考虑dp,即三种操作的影响，其中dp[i,j]即 s1 的前i个字符变换到 s2的前j的字符需要的次数
* 插：dp[i][j-1]+1，即s2在少一个字符的情况下，s1变成s2之后只需要插入一个就行
* 删：dp[i-1][j]+1, 即s1(i-1)变成s2后,只需要把s1(i)删除即可。
*       如 h ---> rcs(n次操作)则，ho--->rcs，中h变成rcs需要n此操作，变换后，将剩余的o删除即可
* 替：dp[i-1][j-1]+1
*
* 注意特殊情况：s1[i]==s2[j]时，dp[i][j]==dp[i-1][j-1]
* */
public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length() + 1;
        int len2 = word2.length() + 1;
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(
                            Math.min(
                                    dp[i - 1][j - 1],
                                    dp[i - 1][j]
                            ),
                            dp[i][j - 1]
                    ) + 1;
                }
            }
        }
        return dp[len1 - 1][len2 - 1];
    }
}
