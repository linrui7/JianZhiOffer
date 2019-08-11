/*
   Author:linrui
   Date:2019/8/11
   Content:
   输入一个链表，输出该链表中倒数第k个结点。
*/

public class EndK {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        if(length<k){
            return null;
        }else if(length==k){
            return head;
        }else {
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<k;i++){
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }
}

