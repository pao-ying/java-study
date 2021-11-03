package com.example.code.solution440;

/*
* 字典序就是多个树结构，如以1为前缀的数字都要小于以2为前缀的数字，则如下以1为前缀的树
*           1
*       0       9
*   0               9
* 0                     9
* 每一层都是*10。
* 如第一层 [1, 1]
* 第二层[10, 19]
* 第三层[100, 199]
* 若前缀是 prefix，则第n层是 [ prefix*10^(n-1), (prefix+1)*10^(n-1) )
* 依次累加，可以获得以1为前缀的个数
* 题目问的是第k小，则遍历前缀，看k再哪个数字前缀下
* */
public class Solution {
    public int findKthNumber(int n, int k) {
        int p = 1;
        int prefix = 1;
        // 当 p==k 时跳出
        while (p < k) {
            // 计算当前前缀的树的节点数
            int count = getCount(prefix, n);
            // p + count - 1 >=k
            if (p + count > k) {
                // 在当前前缀下，一下跳一层如 1 -> 10 -> 100，数字数量+1
                prefix *= 10;
                p++;
            } else if (p + count <= k) { // p + count -1 < k
                // 不在当前前缀下，即该数小了
                prefix++;
                // +count而不是count-1，跳到下一个前缀树上
                p += count;
            }
        }
        return prefix;
    }

    // 以prefix为前缀，以n为上界的数字总和
    public int getCount(int prefix, int n) {
        // 使用long，因为*10容易溢出
        long cur = prefix;
        long next = prefix + 1;
        int count = 0;
        // 当前前缀要小于n
        // 计算每一层的数量
        while (cur <= n) {
            // 由于next可能超过了上界，所以比较使用n+1和next
            count += Math.min(next, n + 1) - cur;
            cur *= 10;
            next *= 10;
        }
        return count;
    }
}
