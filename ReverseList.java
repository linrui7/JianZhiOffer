/*
   Author:linrui
   Date:2019/8/12
   Content:输入一个链表，反转链表后，输出新链表的表头。
*/

public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        //判断是否为空
        if (head == null) {
            return null;
        }
        ListNode result = null;
        ListNode cur = head;
        //遍历后进行头插
        while (cur != null) {
            ListNode next = cur.next;//保存下一个节点
            cur.next = result;//当前节点的下一个是头结点
            result = cur;//cur成为头结点
            cur = next;
        }
        return result;
    }
}
