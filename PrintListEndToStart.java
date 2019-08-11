/*
   Author:linrui
   Date:2019/8/11
   Content:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
*/

import java.util.ArrayList;
import java.util.Stack;

public class PrintListEndToStart {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }


    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode cur = listNode;
        while (cur != null) {
            stack.push(cur.val);
            cur=cur.next;
        }
        while (!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        System.out.println(printListFromTailToHead(listNode));
    }
}
