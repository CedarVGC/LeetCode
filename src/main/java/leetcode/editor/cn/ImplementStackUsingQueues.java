/**
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * <p>
 * 实现 MyStack 类：
 * <p>
 * <p>
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 注意：
 * <p>
 * <p>
 * 你只能使用队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
 * 你所使用的语言也许不支持队列。 你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * <p>
 * 输入：
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * 输出：
 * [null, null, null, 2, 2, false]
 * <p>
 * 解释：
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // 返回 2
 * myStack.pop(); // 返回 2
 * myStack.empty(); // 返回 False
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= x <= 9
 * 最多调用100 次 push、pop、top 和 empty
 * 每次调用 pop 和 top 都保证栈不为空
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能否仅用一个队列来实现栈。
 * <p>
 * Related Topics 栈 设计 队列 👍 727 👎 0
 */

package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 用队列实现栈
 *
 * @author DY
 * @date 2023-06-18 23:27:09
 */
public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        //测试代码
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {
        private Queue<Integer> num1;
        private Queue<Integer> num2;

        public MyStack() {
            num1 = new LinkedList<Integer>();
            num2 = new LinkedList<Integer>();
        }

        public void push(int x) {
            num2.add(x);
            while (!num1.isEmpty()) {
                num2.add(num1.poll());
            }
            Queue<Integer> temp = num1;
            num1 = num2;
            num2 = temp;
        }

        public int pop() {
            return num1.poll();
        }

        public int top() {
            return num1.peek();
        }

        public boolean empty() {
            return num1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}