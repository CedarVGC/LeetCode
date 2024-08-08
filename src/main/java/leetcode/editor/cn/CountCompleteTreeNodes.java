/**
 * 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 * <p>
 * 完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第
 * h 层，则该层包含 1~ 2ʰ 个节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,3,4,5,6]
 * 输出：6
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = []
 * 输出：0
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：root = [1]
 * 输出：1
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目范围是[0, 5 * 10⁴]
 * 0 <= Node.val <= 5 * 10⁴
 * 题目数据保证输入的树是 完全二叉树
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：遍历树来统计节点是一种时间复杂度为 O(n) 的简单解决方案。你可以设计一个更快的算法吗？
 * <p>
 * Related Topics 位运算 树 二分查找 二叉树 👍 1164 👎 0
 */

package leetcode.editor.cn;

/**
 * 完全二叉树的节点个数
 *
 * @author DY
 * @date 2024-08-07 10:32:57
 */
public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new CountCompleteTreeNodes().new Solution();
        TreeNode t1 =  new CountCompleteTreeNodes().new TreeNode(1);
        TreeNode t2 =  new CountCompleteTreeNodes().new TreeNode(2);
        TreeNode t3 =  new CountCompleteTreeNodes().new TreeNode(3);
        TreeNode t4 =  new CountCompleteTreeNodes().new TreeNode(4);
        TreeNode t5 =  new CountCompleteTreeNodes().new TreeNode(5);
        TreeNode t6 =  new CountCompleteTreeNodes().new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        System.out.println(solution.countNodes(t1));

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int high = treeHigh(root);
            if (high == 1) {
                return 1;
            }
            return (1 << high) - 1 - countMissNode(root, high);
        }

        public int treeHigh(TreeNode root) {
            if (root.left == null) {
                return 1;
            }
            return 1 + treeHigh(root.left);
        }

        public int countMissNode(TreeNode root, int high) {
            if (high == 2) {
                return (root.left == null ? 1 : 0) + (root.right == null ? 1 : 0);
            }
            high--;
            return countMissNode(root.left, high) + countMissNode(root.right, high);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}