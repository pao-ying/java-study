package com.example.code.solution560;

import java.util.HashMap;
import java.util.Map;

/*
* 1 2 3
* 1 3 6
* map[0]=1
* map[1]=1
* map[0]=2
* map[]
* 前缀和只差=k，说明有一段连续子数组之和为k
* map意义为前缀和为key的数量有value个
* 初始化map[0]=1，即前缀和为0的有1个
* */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
