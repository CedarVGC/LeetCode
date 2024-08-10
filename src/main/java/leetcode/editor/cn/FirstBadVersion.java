/**
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本
 * 都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版
 * 本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 5, bad = 4
 * 输出：4
 * 解释：
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * 所以，4 是第一个错误的版本。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 1, bad = 1
 * 输出：1
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= bad <= n <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 二分查找 交互 👍 1017 👎 0
 */

package leetcode.editor.cn;

import leetcode.editor.cn.base.VersionControl;

/**
 * 第一个错误的版本
 *
 * @author DY
 * @date 2024-08-08 15:18:07
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new FirstBadVersion().new Solution();
        System.out.println(solution.firstBadVersion(2126753390));
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1;
            int mid = 0;
            while (start <= n) {
                mid = start + ((n - start) >> 1);
                if (isBadVersion(mid)) {
                    if (mid == start) {
                        return mid;
                    }
                    n = mid;

                } else {
                    start = mid + 1;
                }
            }
            return mid;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}