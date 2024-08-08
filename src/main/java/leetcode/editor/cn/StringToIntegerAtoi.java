/**
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * <p>
 * 空格：读入字符串并丢弃无用的前导空格（" "）
 * 符号：检查下一个字符（假设还未到字符末尾）为 '-' 还是 '+'。如果两者都不存在，则假定结果为正。
 * 转换：通过跳过前置零来读取该整数，直到遇到非数字字符或到达字符串的结尾。如果没有读取数字，则结果为0。
 * 舍入：如果整数数超过 32 位有符号整数范围 [−2³¹, 231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2³¹ 的整数应该被
 * 舍入为 −2³¹ ，大于 231 − 1 的整数应该被舍入为 231 − 1 。
 * <p>
 * <p>
 * 返回整数作为最终结果。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "42"
 * <p>
 * <p>
 * 输出：42
 * <p>
 * 解释：加粗的字符串为已经读入的字符，插入符号是当前读取的字符。
 * <p>
 * <p>
 * 带下划线线的字符是所读的内容，插入符号是当前读入位置。
 * 第 1 步："42"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："42"（读入 "42"）
 * ^
 * <p>
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = " -042"
 * <p>
 * <p>
 * 输出：-42
 * <p>
 * 解释：
 * <p>
 * <p>
 * 第 1 步："   -042"（读入前导空格，但忽视掉）
 * ^
 * 第 2 步："   -042"（读入 '-' 字符，所以结果应该是负数）
 * ^
 * 第 3 步："   -042"（读入 "042"，在结果中忽略前导零）
 * ^
 * <p>
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：s = "1337c0d3"
 * <p>
 * <p>
 * 输出：1337
 * <p>
 * 解释：
 * <p>
 * <p>
 * 第 1 步："1337c0d3"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："1337c0d3"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："1337c0d3"（读入 "1337"；由于下一个字符不是一个数字，所以读入停止）
 * ^
 * <p>
 * <p>
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：s = "0-1"
 * <p>
 * <p>
 * 输出：0
 * <p>
 * 解释：
 * <p>
 * <p>
 * 第 1 步："0-1" (当前没有读入字符，因为没有前导空格)
 * ^
 * 第 2 步："0-1" (当前没有读入字符，因为这里不存在 '-' 或者 '+')
 * ^
 * 第 3 步："0-1" (读入 "0"；由于下一个字符不是一个数字，所以读入停止)
 * ^
 * <p>
 * <p>
 * <p>
 * 示例 5：
 * <p>
 * <p>
 * 输入：s = "words and 987"
 * <p>
 * <p>
 * 输出：0
 * <p>
 * 解释：
 * <p>
 * 读取在第一个非数字字符“w”处停止。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= s.length <= 200
 * s 由英文字母（大写和小写）、数字（0-9）、' '、'+'、'-' 和 '.' 组成
 * <p>
 * <p>
 * Related Topics 字符串 👍 1819 👎 0
 */

package leetcode.editor.cn;

/**
 * 字符串转换整数 (atoi)
 *
 * @author DY
 * @date 2024-06-21 14:41:02
 */
public class StringToIntegerAtoi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new StringToIntegerAtoi().new Solution();
        System.out.println(solution.myAtoi("-91283472332"));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int myAtoi(String s) {
            Boolean sign = null;
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char t = s.charAt(i);
                if (sign == null && t == ' ') {
                    continue;
                }
                if (sign == null) {
                    if (t == '+') {
                        sign = true;
                        continue;
                    } else if (t == '-') {
                        sign = false;
                        continue;
                    } else {
                        sign = true;
                    }
                }
                if (sign != null && (t < '0' || t > '9')) {
                    return result;
                }
                int digit = (sign ? (t - '0') : ('0' - t));
                if (sign) {
                    if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < (Integer.MIN_VALUE % 10))) {
                        return Integer.MIN_VALUE;
                    }
                }
                result = result * 10 + digit;

            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}