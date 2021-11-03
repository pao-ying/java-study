2. [两数相加](https://leetcode-cn.com/problems/add-two-numbers/)
[代码位置](src/main/java/com/example/code/solution2)
   链表相加
   
3. [无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
[代码位置](src/main/java/com/example/code/solution3)
   
4. [寻找两个正序数组的中位数](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/submissions/)
[代码位置](src/main/java/com/example/code/solution4)
   每次排除 k/2 个数字，类似题目，寻找两个正序数组的第k小数
   
5. [最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
[代码位置](src/main/java/com/example/code/solution5)
   dp: s[i]==s[j] => dp[i][j] = dp[i+1][j-1]
   扩展法：以i为中心和以(i, i+1)为中心
   
8. [字符串转换整数](https://leetcode-cn.com/problems/string-to-integer-atoi/)
[代码位置](src/main/java/com/example/code/solution8)
   
10. [正则表达式匹配](https://leetcode-cn.com/problems/regular-expression-matching/)
[代码位置](src/main/java/com/example/code/solution10)
    dp
    
11. [盛最多的水](https://leetcode-cn.com/problems/container-with-most-water/)
[代码位置](src/main/java/com/example/code/solution11)
    双指针
    
14. [最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/)
[代码位置](src/main/java/com/example/code/solution14)
    str.substring(startIndex, endIndex)
    
15. [三数之和](https://leetcode-cn.com/problems/3sum/)
[代码位置](src/main/java/com/example/code/solution15)
   
19. [删除链表倒数第n个值](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)
[代码位置](src/main/java/com/example/code/solution19)
    快慢指针查找倒数第n个值。注意的是快指针为null的时候，慢指针就是倒数第n个值
    
21. [合并两个有序链表]()
23. [合并K个排序链表](https://leetcode-cn.com/problems/merge-k-sorted-lists/)
[代码位置](src/main/java/com/example/code/solution23)
24. [两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)
[代码位置](src/main/java/com/example/code/solution24)
    遍历或者递归
    
25. [k个一组翻转](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/)
[代码位置](src/main/java/com/example/code/solution25)

31. [下一个排列](https://leetcode-cn.com/problems/next-permutation/)
    [代码位置](src/main/java/com/example/code/solution31)
    技巧/思路题    
    
32. [最长有效括号](https://leetcode-cn.com/problems/longest-valid-parentheses/)
[代码位置](src/main/java/com/example/code/solution32)
    dp, stack, 计数
    
33. [搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)
[代码位置](src/main/java/com/example/code/solution33)

34. [查找元素第一和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
[代码位置](src/main/java/com/example/code/solution34)
    使用二分查找
    
39. [组合总和](https://leetcode-cn.com/problems/combination-sum/)
[代码位置](src/main/java/com/example/code/solution39)
    dfs

40. [组合总和2](https://leetcode-cn.com/problems/combination-sum-ii/)
[代码位置](src/main/java/com/example/code/solution40)

41. [缺失的第一个正数](https://leetcode-cn.com/problems/first-missing-positive/)
[代码位置](src/main/java/com/example/code/solution41)
    把原数组当成map或采用置换
    
42. [接雨水](https://leetcode-cn.com/problems/trapping-rain-water/)
[代码位置](src/main/java/com/example/code/solution42)
    
43. [字符串相乘](https://leetcode-cn.com/problems/multiply-strings/)
[代码位置](src/main/java/com/example/code/solution43)
    

46. [全排列](https://leetcode-cn.com/problems/permutations/)
[代码位置](src/main/java/com/example/code/solution46)
    
47. [全排列2](https://leetcode-cn.com/problems/permutations-ii/)
[代码位置](src/main/java/com/example/code/solution47)

48. [旋转图像](https://leetcode-cn.com/problems/rotate-image/submissions/)
[代码位置](src/main/java/com/example/code/solution48)
    上下水平翻转+沿对角线翻转
    
50. [Pow(x,n)](https://leetcode-cn.com/problems/powx-n/)
[代码位置](src/main/java/com/example/code/solution50)
    
54. [螺旋矩阵](https://leetcode-cn.com/problems/spiral-matrix/)
[代码位置](src/main/java/com/example/code/solution54)

56. [合并区间](https://leetcode-cn.com/problems/merge-intervals/)
    [代码位置](src/main/java/com/example/code/solution56)
    比较左区间右端点和右区间左端点
    
61. [旋转链表](https://leetcode-cn.com/problems/rotate-list/)
[代码位置](src/main/java/com/example/code/solution61)
    看成环，新链表最后一个节点(n-1) - k %n
    
64. [最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/)
[代码位置](src/main/java/com/example/code/solution64)
    dp
    
69. [x的平方根](https://leetcode-cn.com/problems/sqrtx/solution/)
[代码位置](src/main/java/com/example/code/solution69)
    二分查找或者牛顿法
    
72. [编辑距离](https://leetcode-cn.com/problems/edit-distance/)
[代码位置](src/main/java/com/example/code/solution72)
    dp 三种操作对字符串的影响
    
78. [子集](https://leetcode-cn.com/problems/subsets/)
[代码位置](src/main/java/com/example/code/solution78)
    dfs    
    
79. [单词搜索](https://leetcode-cn.com/problems/word-search/)
[代码位置](src/main/java/com/example/code/solution79)
    dfs

82. [删除排序链表中的重复元素2](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/)
[代码位置](src/main/java/com/example/code/solution82)
    
83. [删除排序链表中的重复元素1](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/)
[代码位置](src/main/java/com/example/code/solution83)
    
92. [反转链表II](https://leetcode-cn.com/problems/reverse-linked-list-ii/)
[代码位置](src/main/java/com/example/code/solution92)
    
93. [复原IP地址](https://leetcode-cn.com/problems/restore-ip-addresses/)
[代码位置](src/main/java/com/example/code/solution93)
    dfs + 回溯
    
98. [验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/)
[代码位置](src/main/java/com/example/code/solution98)
    二叉搜索树，中序遍历递增
    
101. [对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/)
[代码位置](src/main/java/com/example/code/solution101)
     dfs和queue, 采用两指针分别指向 p.left, q.right; p.right, q.left;
    
103. [二叉树的锯齿形层次遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)
[代码位置](src/main/java/com/example/code/solution103)
     
104. [二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)
[代码位置](src/main/java/com/example/code/solution104)

105. [前序中序遍历构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
[代码位置](src/main/java/com/example/code/solution105)
     
106. [中序后序遍历构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
[代码位置](src/main/java/com/example/code/solution106)

108. [将有序数组转为二叉搜索树](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/)
[代码位置](src/main/java/com/example/review/code/solution108)

110. [平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree/)
     [代码位置](src/main/java/com/example/code/solution110)
     
114. [二叉树展开为链表](https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/)
[代码位置](src/main/java/com/example/code/solution114)
     dfs
     
112. [路经总和](https://leetcode-cn.com/problems/path-sum/)
[代码位置](src/main/java/com/example/code/solution112)
     dfs
     
121. [买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)
[代码位置](src/main/java/com/example/code/solution121)
     
122. [买卖股票的最佳时机2](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)
[代码位置](src/main/java/com/example/code/solution122)
     
124. [二叉树中的最大路径和](https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/)
[代码位置](src/main/java/com/example/code/solution124)
     dfs
     
128. [最长连续序列](https://leetcode-cn.com/problems/longest-consecutive-sequence/)
[代码位置](src/main/java/com/example/code/solution128)
     hash, 只遍历连续序列最大的
     
135. [分发糖果](https://leetcode-cn.com/problems/candy/)
[代码位置](src/main/java/com/example/code/solution135)
     两次便利
     
129. [根节点到叶子节点的路径和](https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/)
[代码位置](src/main/java/com/example/code/solution129)
     dfs/queue
     
136. [只出现一次的数字](https://leetcode-cn.com/problems/single-number/)
[代码位置](src/main/java/com/example/code/solution136)
     异或
     
138. [复制带随即指针的链表](https://leetcode-cn.com/problems/copy-list-with-random-pointer/)
[代码位置](src/main/java/com/example/code/solution138)
     
143. [重排链表](https://leetcode-cn.com/problems/reorder-list/)
[代码位置](src/main/java/com/example/code/solution143)
     
146. [LRU](https://leetcode-cn.com/problems/lru-cache/)
[代码位置](src/main/java/com/example/code/solution146)

148. (*)[排序链表](https://leetcode-cn.com/problems/sort-list/)
[代码位置](src/main/java/com/example/code/solution148)
     归并排序&快慢指针
     非递归方法较为复杂
    
151. [翻转字符串里的单词](https://leetcode-cn.com/problems/reverse-words-in-a-string/)
[代码位置](src/main/java/com/example/code/solution151)
     使用栈
     
152. [乘积最大子数组](https://leetcode-cn.com/problems/maximum-product-subarray/)
[代码位置](src/main/java/com/example/code/solution152)
     dp
     
153. [寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)
[代码位置](src/main/java/com/example/code/solution153)
     二分
     
155. [最小栈](https://leetcode-cn.com/problems/min-stack/)
[代码位置](src/main/java/com/example/code/solution155)
    使用两个栈，一个存值，一个存当前的最小值   
     
160. [相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/)
[代码位置](src/main/java/com/example/code/solution160)
     
169. [多数元素](https://leetcode-cn.com/problems/majority-element/submissions/)
[代码位置](src/main/java/com/example/code/solution169)
     摩尔投票法
     
198. [打家劫舍](https://leetcode-cn.com/problems/house-robber/)
[代码位置](src/main/java/com/example/code/solution198)
     dp
     
199. [二叉树的右视图](https://leetcode-cn.com/problems/binary-tree-right-side-view/)
[代码位置](src/main/java/com/example/code/solution199)

200. [岛屿数量](https://leetcode-cn.com/problems/number-of-islands/)
[代码位置](src/main/java/com/example/code/solution200)

206. [反转链表](https://leetcode-cn.com/problems/reverse-linked-list/)
[代码位置](src/main/java/com/example/code/solution206)
     
209. [长度最小的子数组](https://leetcode-cn.com/problems/minimum-size-subarray-sum/)
[代码位置](src/main/java/com/example/code/solution209)
     滑动窗口
     
210. [课程表](https://leetcode-cn.com/problems/course-schedule-ii/)
[代码位置](src/main/java/com/example/code/solution210)
     拓扑排序
     
215. [数组中的第k大个元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/)
[代码位置](src/main/java/com/example/code/solution215)
     
221. [最大正方形](https://leetcode-cn.com/problems/maximal-square/)
[代码位置](src/main/java/com/example/code/solution221)
     dp
     
226. [翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)
[代码位置](src/main/java/com/example/code/solution226)
     每个节点都反转即可
     
230. [二叉树中的第k小的数](https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/)
[代码位置](src/main/java/com/example/code/solution230)
     dfs
     
236. [二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)
[代码位置](src/main/java/com/example/code/solution236)

239. [滑动窗口](https://leetcode-cn.com/problems/sliding-window-maximum/)
[代码位置](src/main/java/com/example/code/solution239)
     优先队列/单调双向队列
     
240. [搜索二维矩阵2](https://leetcode-cn.com/problems/search-a-2d-matrix-ii/)
     [代码位置](src/main/java/com/example/code/solution240)
     从右上角开始二分
     
287. [寻找重复数](https://leetcode-cn.com/problems/find-the-duplicate-number/)
[代码位置](src/main/java/com/example/code/solution287)
    快慢指针     

297. [二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/)
[代码位置](src/main/java/com/example/code/solution297)
     bfs,dfs
     
300. [最长上升子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/)
[代码位置](src/main/java/com/example/code/solution300)
     
316. [去除重复字母](https://leetcode-cn.com/problems/remove-duplicate-letters/)
[代码位置](src/main/java/com/example/code/solution316)
     字典序
     
322. [零钱兑换](https://leetcode-cn.com/problems/coin-change/)
[代码位置](src/main/java/com/example/code/solution322)
     dp, dfs

328. [奇偶链表](https://leetcode-cn.com/problems/odd-even-linked-list/)
[代码位置](src/main/java/com/example/code/solution328)
     odd指向奇数，even指向偶数
     
329. [矩阵中的最长递增路径](https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix/)
[代码位置](src/main/java/com/example/code/solution329)
     记忆化深度优先
     
340. [至多包含k个不同字符的最长字串](https://leetcode-cn.com/problems/longest-substring-with-at-most-k-distinct-characters/)
[代码位置](src/main/java/com/example/code/solution340)
     滑动窗口
     
395. [至少有K个重复字符的最长字串](https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/)
[代码位置](src/main/java/com/example/code/solution395)
     递归，分割字符串 s.split(String.valueOf(ch))
     
440. [字典序的第k小数字](https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/)
[代码位置](src/main/java/com/example/code/solution440)
     字典序相当于一个二叉树

460. [LFU缓存](https://leetcode-cn.com/problems/lfu-cache/)
[代码位置](src/main/java/com/example/code/solution460)
     两个双向链表，一个存node，一个存(访问次数，相同访问次数链表)
     
     
470. [用rand7()实现rand10()](https://leetcode-cn.com/problems/implement-rand10-using-rand7/)
[代码位置](src/main/java/com/example/code/solution470)
     randx 与 randy
     
498. [对角线遍历](https://leetcode-cn.com/problems/diagonal-traverse/)
[代码位置](src/main/java/com/example/code/solution498)
     
518. [零钱兑换2](https://leetcode-cn.com/problems/coin-change-2/)
[代码位置](src/main/java/com/example/code/solution518)
     dp，内外层循环交换，由排列数变组合数
     
543. [二叉树的直径](https://leetcode-cn.com/problems/diameter-of-binary-tree/)
[代码位置](src/main/java/com/example/code/solution543)
     dfs

540. [有序数组中的单一元素](https://leetcode-cn.com/problems/single-element-in-a-sorted-array/)
[代码位置](src/main/java/com/example/code/solution540)

556. [下一个更大元素](https://leetcode-cn.com/problems/next-greater-element-iii/)
[代码位置](src/main/java/com/example/code/solution556)
    int -> char[]: ("" + n).toCharArray()
     char[] -> int: Integer.parseInt(new String(str))
     

560. [和为k的子数组](https://leetcode-cn.com/problems/subarray-sum-equals-k/)
[代码位置](src/main/java/com/example/code/solution560)
     前缀和
     
567. [字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
[代码位置](src/main/java/com/example/code/solution567)
     滑动窗口
     
662. [二叉树的最大宽度](https://leetcode-cn.com/problems/maximum-width-of-binary-tree/)
[代码位置](src/main/java/com/example/code/solution662)
     层次遍历，同时记录位置
     
718. [最长重复子数组](https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/)
[代码位置](src/main/java/com/example/code/solution718)
     dp, 滑动窗口
     
739. [每日温度](https://leetcode-cn.com/problems/daily-temperatures/)
     [代码位置](src/main/java/com/example/code/solution739)
     单调栈
     
852. [山峰数组的峰顶索引](https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/)
[代码位置](src/main/java/com/example/code/solution852)
     二分
     
876. [链表的中间结点](https://leetcode-cn.com/problems/middle-of-the-linked-list/)
[代码位置](src/main/java/com/example/code/solution876)
     快慢指针
     
1143. [最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)
[代码位置](src/main/java/com/example/code/solution1143)
      dp
     
1277. [统计全为1的正方形矩阵数量](https://leetcode-cn.com/problems/count-square-submatrices-with-all-ones/)
[代码位置](src/main/java/com/example/code/solution1277)
      dp
      
958. [二叉树的完全性检验](https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/)
[代码位置](src/main/java/com/example/code/solution958)
     dfs，使用prev记录遍历的上一个节点和head记录最左边的节点


## 剑指Offer
51. [数组中的逆序对](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)
    [代码位置](src/main/java/com/example/code/solution51)
    归并
    
54. [二叉搜索树的第K大节点](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)
[代码位置](src/main/java/com/example/JianZhiOffer/solution54)
倒着的中序遍历 right - root - left