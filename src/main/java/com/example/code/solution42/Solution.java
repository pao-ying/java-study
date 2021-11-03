package com.example.code.solution42;

/*
* 本题的原理就是，对于某个点x，寻找该点左边和右边的最大值，并选出最小的min，该点可存储 min - height[x]
* 而从左往右，可以找到左边的最大值，从右往左可以找到右边的最大值，想要一次遍历达到效果就是用双指针。
* 使用双指针，left, right
* 其中maxLeft 和 maxRight 代表left左边最大和right右边最大值
* 当 maxLeft < maxRight 时，对于left来说，右边的 realMaxRight >= maxRight，
* 但是对于left来说没有关系，min=maxLeft，从左往右更新left就行。
* 当 maxLeft > maxRight 时，对于right来说，左边的realMaxLeft >= maxLeft，
* 但是对于right没有关系， min=maxRight，从右往左更新right就行
* */
public class Solution {
    public int trap(int[] height) {
        if (height.length == 1) {
            return 0;
        }
        int left = 1, right = height.length - 2;
        int maxLeft = height[0], maxRight = height[height.length - 1], sum = 0;
        while (left <= right) {
            if (maxLeft < maxRight) {
                sum += Math.max(0, maxLeft - height[left]);
                maxLeft = Math.max(maxLeft, height[left]);
                left++;
            } else {
                sum += Math.max(0, maxRight - height[right]);
                maxRight = Math.max(maxRight, height[right]);
                right--;
            }
        }
        return sum;
    }
}
