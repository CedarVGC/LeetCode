/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的 字母异位词。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= s.length, t.length <= 5 * 10⁴
 * s 和 t 仅包含小写字母
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 * Related Topics 哈希表 字符串 排序 👍 1011 👎 0
 */

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 *
 * @author DY
 * @date 2025-05-05 21:28:44
 */
public class ValidAnagram {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new ValidAnagram().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    continue;
                }
                handlerMap(map, s.charAt(i), true);
                handlerMap(map, t.charAt(i), false);
            }
            return map.size() == 0;
        }

        private void handlerMap(Map<Integer, Integer> map, int ss, boolean sign) {
            int n = sign ? 1 : -1;
            if (map.containsKey(ss)) {
                if (map.get(ss) == -n) {
                    map.remove(ss);
                } else {
                    map.put(ss, map.get(ss) + n);
                }
            } else {
                map.put(ss, n);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}