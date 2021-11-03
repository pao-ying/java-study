package com.example.review.bignum;

/*
* 使用字节数组来保存，一个字节有 8 位，每一位表示一个数字
* byte[0] = 1 1 1 1 1 1 1 1, 其中从右到左表示 0, 1, 2, 3, 4, 5, 6, 7
* byte[1] = 1 1 1 1 1 1 1 1, 其中从右到左表示 8, 9, 10, 11, 12, 13, 14, 15
*
* 好处：
* 1. 占用内存低，省空间
* 2. 运算效率高，查找、修改等不需要遍历
*
* 坏处：
* 1. 数据不能重复
* 2. 如果数据较少，不适宜使用，如 1，100000等。
* */
public class SearchNum {
    static class BigMap {
        private byte[] bits;

        private int maxVal;

        private int capacity;

        BigMap(int maxVal) {
            this.maxVal = maxVal;
            // 存储 maxVal 需要 maxVal / 8 + 1 个 byte，而 >> 3 就是除以 8.
            this.capacity = (maxVal >> 3) + 1;
            this.bits = new byte[capacity];
        }

        /*
         * 添加一个数要考虑 1. 在字节数组的哪一项 -> (num / 8)。 2. 在字节的哪一位 -> (num % 8)
         * */
        public void add(int num) {
            int index = num / 8;
            int pos = num % 8;
            bits[index] |= 1 << pos;
        }

        /*
        * 查看是否有该数，即 byte[index].pos 是否是 1 .使用 与& 运算判断。
        * */
        public boolean contains(int num) {
            int index = num / 8;
            int pos = num % 8;
            return (bits[index] & 1 << pos) != 0;
        }
    }

    public static void main(String[] args) {
        BigMap bm = new BigMap(100);

        bm.add(1);
        bm.add(12);
        bm.add(14);
        bm.add(51);
        bm.add(71);
        bm.add(100);

        System.out.println("12:" + (bm.contains(12)?"存在":"不存在"));
        System.out.println("13:" + (bm.contains(13)?"存在":"不存在"));
        System.out.println("51:" + (bm.contains(51)?"存在":"不存在"));
        System.out.println("66:" + (bm.contains(66)?"存在":"不存在"));
        System.out.println("100:" + (bm.contains(100)?"存在":"不存在"));
    }


}
