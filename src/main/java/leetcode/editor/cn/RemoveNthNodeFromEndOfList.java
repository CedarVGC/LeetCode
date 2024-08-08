/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * Related Topics 链表 双指针 👍 2881 👎 0
 */

package leetcode.editor.cn;

/**
 * 删除链表的倒数第 N 个结点
 *
 * @author DY
 * @date 2024-06-24 07:34:27
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next == null) {
                return null;
            }
            ListNode t = head;
            ListNode pre = null;
            while (t != null) {
                if (pre != null) {
                    pre = pre.next;
                }
                if (n == 0) {
                    pre = head;
                }
                n--;
                t = t.next;
            }
            if (pre == null) {
                return head.next;
            }
            pre.next = pre.next.next;
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}