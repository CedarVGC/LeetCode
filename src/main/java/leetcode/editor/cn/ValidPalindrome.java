//如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。 
//
// 字母和数字都属于字母数字字符。 
//
// 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出：true
//解释："amanaplanacanalpanama" 是回文串。
// 
//
// 示例 2： 
//
// 
//输入：s = "race a car"
//输出：false
//解释："raceacar" 不是回文串。
// 
//
// 示例 3： 
//
// 
//输入：s = " "
//输出：true
//解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
//由于空字符串正着反着读都一样，所以是回文串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 105 
// s 仅由可打印的 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 
// 👍 630 👎 0


package leetcode.editor.cn;

/**
 * 验证回文串
 *
 * @author DY
 * @date 2023-04-29 00:34:04
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new ValidPalindrome().new Solution();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s == null) {
                return true;
            }
            int l = 0;
            int r = s.length() - 1;
            while (l <= r) {
                if (tran(s.charAt(l)) == null) {
                    l++;
                    continue;
                } else if (tran(s.charAt(r)) == null) {
                    r--;
                    continue;
                } else {
                    if (!tran(s.charAt(l)).equals(tran(s.charAt(r)))){
                    	return false;
					}else {
                    	l++;
                    	r--;
                    	continue;
					}
                }
            }
            return true;
        }
		private Character tran(char s) {
			if (s >= 48 && s <= 57) {
				return s;
			} else if (s >= 65 && s <= 90) {
				return (char) (s + 32);
			} else if (s >= 97 && s <= 122) {
				return s;
			} else {
				return null;
			}
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}