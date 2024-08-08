/**
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 * <p>
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 * <p>
 * <p>
 * <p>
 * 示例1:
 * <p>
 * <p>
 * 输入: pattern = "abba", s = "dog cat cat dog"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入:pattern = "abba", s = "dog cat cat fish"
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: pattern = "aaaa", s = "dog cat cat dog"
 * 输出: false
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= pattern.length <= 300
 * pattern 只包含小写英文字母
 * 1 <= s.length <= 3000
 * s 只包含小写英文字母和 ' '
 * s 不包含 任何前导或尾随对空格
 * s 中每个单词都被 单个空格 分隔
 * <p>
 * <p>
 * Related Topics 哈希表 字符串 👍 660 👎 0
 */

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 *
 * @author DY
 * @date 2024-08-07 22:41:50
 */
public class WordPattern {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new WordPattern().new Solution();
        solution.wordPattern("abba","dog cat cat dog");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] sList = s.split(" ");
            if(pattern.length()!=sList.length){
                return false;
            }
           Map<String,Character> map1 = new HashMap<>();
            Map<Character,String> map2 = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                if(map1.containsKey(sList[i])){
                    if(c!=map1.get(sList[i])){
                        return false;
                    }
                }else{
                    map1.put(sList[i],c);
                }
                if(map2.containsKey(c)){
                    if(!sList[i].equals(map2.get(c))){
                        return false;
                    }
                }else{
                    map2.put(c,sList[i]);
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}