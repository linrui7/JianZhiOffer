/*
   Author:linrui
   Date:2019/8/15
   Content:
   输入一个复杂链表（每个节点中有节点值，
   以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
   返回结果为复制后复杂链表的head。
*/

public class DeepCopy {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        //首先判断空
        if (pHead == null) {
            return null;
        }
        //复制链表。如果是1-2-3 那么现在是1-1-2-2-3-3
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode newNode = new RandomListNode(cur.label);
            RandomListNode next = cur.next;
            cur.next = newNode;
            newNode.next = next;
            cur = next;
        }

        cur = pHead;
        while (cur != null) {
            RandomListNode newNode = cur.next;
            if (cur.random == null) {
                newNode.random = null;
            } else {
                newNode.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = pHead;
        RandomListNode res = cur.next;
        while (cur != null) {
            RandomListNode newNode = cur.next;
            cur.next = newNode.next;
            newNode.next = newNode.next == null ? null : newNode.next.next;
            cur = cur.next;
        }
        return res;
    }
}
