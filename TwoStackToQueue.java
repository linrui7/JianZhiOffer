/*
   Author:linrui
   Date:2019/8/11
   Content:
   用两个栈来实现一个队列，完成队列的Push和Pop操作。
*/

import java.util.Stack;

public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
