package leetcode.editor.cn;

//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 104 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
// Related Topics 位运算 数学 字符串 模拟 
// 👍 879 👎 0

public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        System.out.println(solution.addBinary("11", "1"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            int end = (a.length() > b.length() ? a.length() : b.length()) + 1;
            while (a.length() < end) {
                a = "0" + a;
            }
            while (b.length() < end) {
                b = "0" + b;
            }
            boolean isCarry = false;
            String s = "";
            for (int i = end - 1; i >= 0; i--) {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    if (isCarry) {
                        s = "1" + s;
                        isCarry = false;
                    } else {
                        if (i != 0) {
                            s = "0" + s;
                        }
                    }

                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    if (isCarry) {
                        s = "1" + s;
                    } else {
                        s = "0" + s;
                        isCarry = true;
                    }
                } else {
                    if (isCarry) {
                        s = "0" + s;
                    } else {
                        s = "1" + s;
                    }
                }
            }
            return s;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
