/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 3 <= nums.length <= 3000
 * -10⁵ <= nums[i] <= 10⁵
 * <p>
 * <p>
 * Related Topics 数组 双指针 排序 👍 6908 👎 0
 */

package leetcode.editor.cn;

import java.util.*;

/**
 * 三数之和
 *
 * @author DY
 * @date 2024-06-23 17:39:22
 */
public class ThreeSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new ThreeSum().new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            int zeroNum = 0;
            Map<Integer, Boolean> lMap = new HashMap<Integer, Boolean>();
            Map<Integer, Boolean> rMap = new HashMap<Integer, Boolean>();
            for (int n : nums) {
                if (n < 0) {
                    addMap(n, lMap);
                } else if (n > 0) {
                    addMap(n, rMap);
                } else {
                    zeroNum++;
                }
            }
            if (zeroNum >= 3) {
                res.add(Arrays.asList(0, 0, 0));
            }
            int m;
            for (int l : lMap.keySet()) {
                for (int r : rMap.keySet()) {
                    m = l + r;
                    if (m > 0) {
                        addM(r, l, -m, lMap, res);
                    } else if (m < 0) {
                        addM(l, r, -m, rMap, res);
                    } else {
                        if (zeroNum > 0) {
                            res.add(Arrays.asList(l, 0, r));
                        }
                    }
                }
            }
            return res;
        }

        public void addMap(int n, Map<Integer, Boolean> map) {
            if (!map.containsKey(n)) {
                map.put(n, false);
                return;
            }
            boolean b = map.get(n);
            if (b) {
                return;
            } else {
                map.put(n, true);
            }
        }

        public void addM(int k, int n, int m, Map<Integer, Boolean> map, List<List<Integer>> res) {
            if (!map.containsKey(m)) {
                return;
            }
            if ((n == m) && !map.get(n)) {
                return;
            }
            if (n > m) {
                return;
            }
            res.add(Arrays.asList(k, n, m));
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}