package com.example.review.sort;

/*
* 堆排序 nlogn
* */
public class HeapSort {
    MaxHeapSort maxHeapSort;
    MinHeapSort minHeapSort;

    HeapSort() {
        maxHeapSort = new MaxHeapSort();
        minHeapSort = new MinHeapSort();
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    class MaxHeapSort {
        public int[] heapSort(int[] nums) {
            // 从最后一个非叶子节点，从右到左，从下到上，构建大根堆
            for (int i = nums.length / 2 - 1; i >= 0; i--) {
                adjustHeap(nums, i, nums.length);
            }
            // 最后一个和第一个元素交换，并排序
            for (int i = nums.length - 1; i > 0; i--) {
                swap(nums, 0, i);
                adjustHeap(nums, 0, i);
            }
            return nums;
        }

        public void adjustHeap(int[] nums, int index, int length) {
            for (int k = index * 2 + 1; k < length; k = k * 2 + 1) {
                // 交换为右节点
                if (k + 1 < length && nums[k + 1] > nums[k]) {
                    k = k + 1;
                }
                // 判断是否大于根节点, 大于则直接交换，不大于就跳出
                if (nums[k] > nums[index]) {
                    swap(nums, k, index);
                    // 注意交换 index
                    index = k;
                } else {
                    break;
                }
            }
        }
    }

    class MinHeapSort {
        public int[] heapSort(int[] nums) {
            for (int i = nums.length / 2 - 1; i >= 0; i--) {
                adjustHeap(nums, i, nums.length);
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                swap(nums, 0, i);
                adjustHeap(nums, 0, i);
            }
            return nums;
        }

        public void adjustHeap(int[] nums, int index, int length) {
            for (int k = index * 2 + 1; k < length; k = k * 2 + 1) {
                if (k + 1 < length && nums[k + 1] > nums[k]) {
                    k = k + 1;
                }
                if (nums[k] < nums[index]) {
                    swap(nums, k, index);
                    index = k;
                } else {
                    break;
                }
            }
        }
    }

}
