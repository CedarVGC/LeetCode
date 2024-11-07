/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 如果存在一个整数 x 使得 n == 2ˣ ，则认为 n 是 2 的幂次方。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 1
 * 输出：true
 * 解释：2⁰ = 1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 16
 * 输出：true
 * 解释：2⁴ = 16
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：n = 3
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * -2³¹ <= n <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能够不使用循环/递归解决此问题吗？
 * <p>
 * Related Topics 位运算 递归 数学 👍 690 👎 0
 */

package leetcode.editor.cn;

/**
 * 2 的幂
 *
 * @author DY
 * @date 2024-08-12 21:12:14
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new PowerOfTwo().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 2 || n == 1) {
                return true;
            } else if (n <= 0) {
                return false;
            }
            return (n & 1) == 0 && isPowerOfTwo(n >> 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}