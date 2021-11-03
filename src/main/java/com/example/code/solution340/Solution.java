package com.example.code.solution340;

import java.util.HashMap;
import java.util.Map;

/*
* 滑动窗口+map
* 当map.size<=k时，将字符放进map中，同时记录或更新该字符在(left, right)中的位置
* 当map.size>k时，查找map中right最靠左的一个元素，删除它，并令left=min+1
* */
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int left = 0, right = 0, ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            // 更新位置
            map.put(s.charAt(right), right);
            if (map.size() > k) {
                char minKey = 0;
                int minValue = Integer.MAX_VALUE;
                for (Map.Entry<Character, Integer> entry: map.entrySet()) {
                    if (entry.getValue() < minValue) {
                        minValue = entry.getValue();
                        minKey = entry.getKey();
                    }
                }
                map.remove(minKey);
                left = minKey + 1;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
