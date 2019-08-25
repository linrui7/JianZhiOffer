/*
   Author:linrui
   Date:2019/8/25
   Content:
   输入两个链表，找出它们的第一个公共结点。
*/

public class FindFirstCommonNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        while (current1 != null) {
            length1 += 1;
            current1 = current1.next;
        }
        while (current2 != null) {
            length2 += 1;
            current2 = current2.next;
        }

        int quick = Math.abs(length1 - length2);
        //A比B长
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        if (length1 > length2) {
            for (int i = 0; i < quick; i++) {
                cur1 = cur1.next;
            }
            while (cur1!=null){
                if(cur1==cur2){
                    return cur1;
                }
                cur1=cur1.next;
                cur2=cur2.next;

            }
            return null;
        }
        if (length1 <= length2) {
            for (int i = 0; i < quick; i++) {
                cur2 = cur2.next;
            }
            while (cur2!=null){
                if(cur1==cur2){
                    return cur1;
                }
                cur1=cur1.next;
                cur2=cur2.next;

            }
            return null;
        }
        return null;
    }
}
