package leetcode.editor.cn;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 
// 👍 8330 👎 0

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        solution.lengthOfLongestSubstring("pwwkew");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            String temp = "";
            int i = 0;
            while (i < s.length()) {
                int index = findLastA(temp, s.charAt(i));
                if (index != -1) {
                    if (maxLength < temp.length()) {
                        maxLength = temp.length();
                    }
                    i = i - (temp.length() - index);
					temp = "";
                } else {
                    temp += s.charAt(i);
                }
                i++;
            }
            return maxLength > temp.length() ? maxLength : temp.length();
        }

        private int findLastA(String s, char a) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == a) {
                    return i;
                }
            }
            return -1;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
