//给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。 
//
// 
// 
// 
//
// 示例 1 ： 
//
// 
//输入：nums = [2,2,1]
//输出：1
// 
//
// 示例 2 ： 
//
// 
//输入：nums = [4,1,2,1,2]
//输出：4
// 
//
// 示例 3 ： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 104 
// -3 * 104 <= nums[i] <= 3 * 104 
// 除了某个元素只出现一次以外，其余每个元素均出现两次。 
// 
// 
// 
// Related Topics 位运算 数组 
// 👍 2847 👎 0


package leetcode.editor.cn;

/**
 * 只出现一次的数字
 *
 * @author DY
 * @date 2023-04-28 21:40:10
 */
public class SingleNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new SingleNumber().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            /**
             * 1、任意两个相同的数异或的值为0，任何数与0的异或至为原值。x ^ x = 0，0 ^ x = x。
             *
             * 2、多个数异或运算时，最终都将所有值的操作位做一遍是否相同的比较，所以可以得到：x^(y^z) = (x^y)^z。
             *
             */
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = result ^ nums[i];
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}