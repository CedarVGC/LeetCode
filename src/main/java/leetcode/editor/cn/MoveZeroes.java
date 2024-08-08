/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: nums = [0]
 * 输出: [0]
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁴
 * -2³¹ <= nums[i] <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能尽量减少完成的操作次数吗？
 * <p>
 * Related Topics 数组 双指针 👍 2425 👎 0
 */

package leetcode.editor.cn;

/**
 * 移动零
 *
 * @author DY
 * @date 2024-08-08 11:26:45
 */
public class MoveZeroes {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new MoveZeroes().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count++;
                } else {
                    nums[i - count] = nums[i];
                }
            }

            for (; count > 0; count--) {
                nums[nums.length - count] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}