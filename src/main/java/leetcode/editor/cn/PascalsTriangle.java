package leetcode.editor.cn;

//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划 
// 👍 949 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
        System.out.println(solution.generate(5));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
            List<Integer> pre = new ArrayList<Integer>(1);
            pre.add(1);
            result.add(pre);
            for (int i = 2; i <= numRows; i++) {
                List<Integer> now = new ArrayList<Integer>(i);
                now.add(1);
                for (int j = 0; j < pre.size() - 1; j++) {
                    now.add(pre.get(j) + pre.get(j + 1));
                }
                now.add(1);
                result.add(now);
                pre = now;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
