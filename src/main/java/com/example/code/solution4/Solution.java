package com.example.code.solution4;

/*
* 基本原理就是，对于两个有序的数组，查看合并后的第k小的数，
* 令m = k / 2，比较两个数组中 第 k/2 个数的大小，较小的那个数组中[0, k/2]直接忽略，第k小数肯定不存在于其中
* 调用尾递归（即上一层不会使用下一层的数据）
* 其中还有一层原理就是每次都**排除** k/2 个数字，加快速度。当不满足k/2个数字的时候，就排除剩下的数字。
* */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int len = n + m;
        // 奇数即 len/2+1，偶数即 (len/2, len/2+1)
        // 但是写成 ( len + 1 / 2， len + 2 / 2)可让奇数求同一k，达到偶数和奇数统一
        int target1 = (len + 1) / 2;
        int target2 = (len + 2) / 2;
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, target1) +
                getKth(nums1, 0, n - 1, nums2, 0, m - 1, target2)) * 0.5;
    }

    public int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int target) {

        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;

        // 永远都往 nums1 先到终点，这样就只需要处理 num1 出界的情况
        // 不要忘记 return
        if (len1 > len2) {
            return getKth(nums2, start2, end2, nums1, start1, end1, target);
        }

        // 即 nums1 出界
        // 主要问题是第一次出界还是第二次出界，因为第一次出界会回到len1，而第二次出界直接从nums2中取值
        // 因为下面 p = math.min(end1, ....)，所以第一次出界时的确是 end1，此时len1=1,
        // 但是第二次出界时是 end1 + 1，则此时 len1 = 0
        if (len1 == 0) {
            return nums2[start2 + target - 1];
        }

        if (target == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int p = Math.min(end1, start1 + (target / 2) - 1);
        int q = Math.min(end2, start2 + (target / 2) - 1);

        // 当 len1 或 len2 的长度 < target / 2，说明即将出界，这个时候排除的数字数量就不是 k/2，而是len1
        if (nums1[p] > nums2[q]) {
            return getKth(nums1, start1, end1, nums2, q + 1, end2, target - Math.min(len2, target / 2));
        } else {
            return getKth(nums1, p + 1, end1, nums2, start2, end2, target - Math.min(len1, target / 2));
        }
    }
}
