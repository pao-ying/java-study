package com.example.code.solution22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 当 n 到 n+1 时，添加一组括号，可以在原字符串最左边添加一个 ( , 然后在原字符串里面找到合适位置插入 )，
* 即 (A)B, 其中 A + B = n, A 和 B 都是合法的括号
* 如 2 到 3 过程中
* A = 0, B = 2
* A = 1, B = 1
* A = 2, B = 0
* */
public class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<List<String>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(List.of("")));
        ans.add(new ArrayList<>(List.of("()")));
        for (int i = 2; i <= n; i ++) {
            List<String> temp = new ArrayList<>();
            // p 和 q 分配 i - 1
            for (int j = 0; j <= i - 1; j++) {
                StringBuilder str = new StringBuilder();
                str.append("(");
                for (int z = 0; z < ans.get(j).size(); z++) {
                    str.append(ans.get(j).get(z));
                    str.append(")");
                    int m = i - 1 - j;
                    for (int k = 0; k < ans.get(m).size(); k++) {
                        str.append(ans.get(m).get(k));
                        temp.add(str.toString());
                    }
                }
            }
            ans.add(temp);
        }
        return ans.get(n);
    }
}
