/**
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入：s = "egg", t = "add"
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "foo", t = "bar"
 * 输出：false
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：s = "paper", t = "title"
 * 输出：true
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 1 <= s.length <= 5 * 10⁴
 * t.length == s.length
 * s 和 t 由任意有效的 ASCII 字符组成
 * <p>
 * <p>
 * Related Topics 哈希表 字符串 👍 730 👎 0
 */

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 *
 * @author DY
 * @date 2024-08-10 20:59:44
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new IsomorphicStrings().new Solution();
        solution.isIsomorphic("egg", "add");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> s2t = new HashMap<>();
            Map<Character, Character> t2s = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (s2t.containsKey(s.charAt(i))) {
                    if (s2t.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                } else {
                    s2t.put(s.charAt(i), t.charAt(i));
                }
                if (t2s.containsKey(t.charAt(i))) {
                    if (t2s.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }
                } else {
                    t2s.put(t.charAt(i), s.charAt(i));
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}