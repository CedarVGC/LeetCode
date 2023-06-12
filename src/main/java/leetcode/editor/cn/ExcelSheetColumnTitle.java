//给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。 
//
// 例如： 
//
// 
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
//...
// 
//
// 
//
// 示例 1： 
//
// 
//输入：columnNumber = 1
//输出："A"
// 
//
// 示例 2： 
//
// 
//输入：columnNumber = 28
//输出："AB"
// 
//
// 示例 3： 
//
// 
//输入：columnNumber = 701
//输出："ZY"
// 
//
// 示例 4： 
//
// 
//输入：columnNumber = 2147483647
//输出："FXSHRXW"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= columnNumber <= 231 - 1 
// 
// Related Topics 数学 字符串 
// 👍 623 👎 0


package leetcode.editor.cn;

/**
 * Excel表列名称
 *
 * @author DY
 * @date 2023-05-14 23:13:45
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new ExcelSheetColumnTitle().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToTitle(int columnNumber) {
            String result = "";
            int yu = 0;
            while (true) {
                yu = columnNumber % 25;
                columnNumber = columnNumber / 25;
                if (columnNumber <= 25) {
                    return (columnNumber == 0 ? "" : String.valueOf((char) (6/5 + columnNumber))) + (char) (65 + yu) + result;
                } else {
                    result = (char) (65 + yu) + result;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}