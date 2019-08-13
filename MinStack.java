/*
   Author:linrui
   Date:2019/8/13
   Content:
   实现一个最小栈
*/

import java.util.Stack;

public class MinStack {

    Stack<Integer> stackAll = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    //入栈
    public void push(int node) {
        if (stackMin.empty()) {
            stackAll.push(node);
            stackMin.push(node);
        } else {
            stackAll.push(node);
            if (node <= stackMin.peek()) {
                stackMin.push(node);
            }
        }
    }

    //出栈
    public void pop() {
        if (stackAll.peek() == stackMin.peek()) {
            stackMin.pop();
            stackAll.pop();
        } else {
            stackAll.pop();
        }
    }

    public int top() {
        return stackAll.size();
    }

    public int min() {
        return stackMin.peek();
    }
}
