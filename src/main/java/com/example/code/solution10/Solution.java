package com.example.code.solution10;

/*
* dp[i][j]表示s的前i个字符与p的前j个字符是否匹配
* if s[i]==p[j]
*   dp[i][j] = dp[i-1][j-1]
* else
*   if p[j] == '.'
*       dp[i][j] = dp[i-1][j-1] // 因为'.'可以匹配任意字符，所以即使不相等也没关系
*   elif p[j] == '*' // 因为 '*' 是匹配0个或多个前面的字符，所以需要判断s[i]和p[j-1]的情况
*       // 如 ##a, ###*
*       if s[i] != p[j-1]   // 如 ##a, ##b*, 则b*可以去掉，观察dp[i][j-2]即可
*           dp[i][j] = dp[i][j-2]
*       elif s[i] == p[j-1] // 如 ##a, ##a*， 或者p[j-1]='.'
*           // (i-1, j)即 ##， ##a*，为真的情况下s后面填多少a都没有关系
*           // (i, j-1)即 ##a, ##a, 为真的情况下，*作为添加一个a，是(i-1,j)的子问题，不用关心
*           // (i-1, j-1)即 ##, ##a, 为真的情况下，*作为添加2个a，是(i-1,j)的子问题，不用关心
*           // (i, j-2)即 ##a, ##， 为真的情况下，*作为添加0个a
*           // (i-1, j-2)即##, ##，为真的情况下，也是(i-1, j)的子问题, 不用关心
*
*           // 所以总结下来就是 如果是 * ，就判断前一个元素是添加多个还是添加0个，哪些dp会对他产生影响
*           dp[i][j] = dp[i-1][j] || dp[i][j-2]
*
* 注意，因为涉及 i-1, j-1等，但循环是从i=0开始的，所以，我们从i=1开始，这样，每次就比较i-1和j-1即可
* */
public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        // s为空和p为空能匹配上
        dp[0][0] = true;
        // p为空，s不为空必为false，即dp[i][0] = false;
        // s为空，p不为空，由于*可以匹配0个字符，所以有可能为空, dp[0][j]
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) == '*') {
                // 如果第j个是*，则第j和第j-1都是可有可无，所以看第j-2个
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 2];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
