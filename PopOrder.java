/*
   Author:linrui
   Date:2019/8/13
   Content:第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。

   入栈1,2,3,4,5

   出栈4,5,3,2,1

   1234  4出 5入 5321出

*/

import java.util.Stack;

public class PopOrder {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        //遍历原数组，将数添加到栈中，和出数组对比，相同就出栈，不同就继续入栈。
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.empty();
    }
}
