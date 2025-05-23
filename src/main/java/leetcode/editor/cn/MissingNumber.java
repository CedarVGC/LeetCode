/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [9,6,4,2,3,5,7,0,1]
 * 输出：8
 * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：nums = [0]
 * 输出：1
 * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == nums.length
 * 1 <= n <= 10⁴
 * 0 <= nums[i] <= n
 * nums 中的所有数字都 独一无二
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 * <p>
 * Related Topics 位运算 数组 哈希表 数学 二分查找 排序 👍 847 👎 0
 */

package leetcode.editor.cn;

/**
 * 丢失的数字
 *
 * @author DY
 * @date 2024-11-10 23:33:27
 */
public class MissingNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new MissingNumber().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int missingNumber(int[] nums) {
            int sum = nums.length * (nums.length + 1) / 2;
            int sum2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= 0 && nums[i] <= nums.length) {
                    sum2 += nums[i];
                }
            }
            return sum - sum2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}