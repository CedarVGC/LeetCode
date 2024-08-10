/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [], val = 1
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 列表中的节点数目在范围 [0, 10⁴] 内
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 * <p>
 * <p>
 * Related Topics 递归 链表 👍 1450 👎 0
 */

package leetcode.editor.cn;

import leetcode.editor.cn.base.ListNode;

/**
 * 移除链表元素
 *
 * @author DY
 * @date 2024-08-10 16:18:55
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new RemoveLinkedListElements().new Solution();
        ListNode v1 = new ListNode(1);
        ListNode v2 = new ListNode(2);
        ListNode v3 = new ListNode(6);
        ListNode v4 = new ListNode(3);
        ListNode v5 = new ListNode(4);
        ListNode v6 = new ListNode(5);
        ListNode v7 = new ListNode(6);
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        v5.next = v6;
        v6.next = v7;
        System.out.println(solution.removeElements(v1, 6));
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
        public ListNode removeElements(ListNode head, int val) {

            ListNode t = new ListNode(0, head);
            ListNode v1 = t;
            ListNode v2 = head;
            while (v2 != null) {
                if (v2.val != val) {
                    v1.next = v2;
                    v1 = v1.next;
                }
                v2 = v2.next;
            }
            v1.next=null;
            return t.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    public ListNode removeElements1(ListNode head, int val) {
        ListNode t = new ListNode(0, head);
        ListNode v = t;
        while (v != null && v.next != null) {
            if (v.next.val == val) {
                v.next = v.next.next;
            } else {
                v = v.next;
            }

        }
        return t.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        ListNode t = new ListNode(0, head);
        ListNode v1 = t;
        ListNode v2 = head;
        while (v2 != null) {
            if (v2.val != val) {
                v1.next = v2;
                v1 = v1.next;
            }
            v2 = v2.next;

        }
        return t.next;
    }

}