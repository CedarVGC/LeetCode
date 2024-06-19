/**
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 * <p>
 * 例如：
 * <p>
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: columnTitle = "A"
 * 输出: 1
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: columnTitle = "AB"
 * 输出: 28
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: columnTitle = "ZY"
 * 输出: 701
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle 仅由大写英文组成
 * columnTitle 在范围 ["A", "FXSHRXW"] 内
 * <p>
 * <p>
 * Related Topics 数学 字符串 👍 409 👎 0
 */

package leetcode.editor.cn;

/**
 * Excel 表列序号
 *
 * @author DY
 * @date 2024-06-19 23:15:26
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        //测试代码
        Solution solution = new ExcelSheetColumnNumber().new Solution();
        System.out.println(solution.titleToNumber("AB"));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int titleToNumber(String columnTitle) {
            int result = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                result = result + (int) Math.pow(26, i) * (columnTitle.charAt(columnTitle.length() - i - 1) - 'A' + 1);
            }
            return result;
        }

        public int titleToNumber2(String columnTitle) {
            int n = columnTitle.length();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}