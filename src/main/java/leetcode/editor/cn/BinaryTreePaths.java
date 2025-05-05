/**
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,3,null,5]
 * 输出：["1->2->5","1->3"]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1]
 * 输出：["1"]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目在范围 [1, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 字符串 回溯 二叉树 👍 1227 👎 0
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author DY
 * @date 2025-05-05 22:42:42
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new BinaryTreePaths().new Solution();
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> r = new ArrayList<>();
            dfs(root, new StringBuilder(), r);
            return r;
        }

        private void dfs(TreeNode root, StringBuilder sb, List<String> paths) {
            if (root == null) {
                return;
            }
            int curLen = sb.length();
            sb.append(root.val);
            if (root.left == null && root.right == null) {
                paths.add(sb.toString());
                sb.setLength(curLen);
                return;
            }
            sb.append("->");
            dfs(root.left, sb, paths);
            dfs(root.right, sb, paths);
            sb.setLength(curLen);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}