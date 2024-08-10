/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」 定义为：
 * <p>
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * <p>
 * <p>
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 1² + 9² = 82
 * 8² + 2² = 68
 * 6² + 8² = 100
 * 1² + 0² + 0² = 1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 2
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 哈希表 数学 双指针 👍 1593 👎 0
 */

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 快乐数
 *
 * @author DY
 * @date 2024-08-09 09:32:11
 */
public class HappyNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new HappyNumber().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> nums = new HashSet<>();
            while (true) {
                if (n == 1) {
                    return true;
                }
                nums.add(n);
                n = getNextNumber(n);
                if (nums.contains(n)) {
                    return false;
                }
            }
        }

        private int getNextNumber(int n) {
            int res = 0;
            while (n > 0) {
                int temp = n % 10;
                res += temp*temp;
                n = n / 10;
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}