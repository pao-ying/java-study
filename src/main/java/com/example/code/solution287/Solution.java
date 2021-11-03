package com.example.code.solution287;

/*
* 将数组的值同样作为索引，可以达到 链表中的 next 的效果
*  1 -> 2 -> 3 ->  4 ->  2
* 则可以使用题142的思路，快慢指针
* s和f相遇后，s再与head相遇即可
* */
public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];

        }
        return slow;
    }
}
