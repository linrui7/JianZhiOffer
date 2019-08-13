/*
   Author:linrui
   Date:2019/8/13
   Content:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
   二叉树的层序遍历
*/

import java.util.ArrayList;

public class PrintTree {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //模拟一个队列存放层序遍历的节点。
        ArrayList<TreeNode> queue = new ArrayList<>();
        //创建一个链表存放值
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        //保存根节点，接下来遍历如果有左右则添加到队列末尾
        queue.add(root);
        while (!queue.isEmpty()) {
            //移除0号元素，将移除的TreeNode的值保存到List中，并且将TreeNode左右子树添加进去,
            TreeNode tmp = queue.remove(0);
            list.add(tmp.val);
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
        return list;
    }
}
