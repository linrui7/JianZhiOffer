/*
   Author:linrui
   Date:2019/8/16
   Content:
   输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
   要求不能创建任何新的结点，只能调整树中结点指针的指向。
*/

public class Convert {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode lefthead = null;
    TreeNode righthead=null;

    //左根右 每个节点的right设为下一个节点，下一个节点的left设为上一个节点
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        //将左边叶子节点成为链表的第一个节点、
        Convert(pRootOfTree.left);
        if(righthead==null){
            lefthead=pRootOfTree;
            righthead=pRootOfTree;
        }else {
            //将根节点插入到双向链表右边。rightHead后移
            righthead.right=pRootOfTree;
            pRootOfTree.left=righthead;
            righthead=pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return lefthead;
    }
}
