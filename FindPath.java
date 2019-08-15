/*
   Author:linrui
   Date:2019/8/15
   Content:

   输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
   路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
   (注意: 在返回值的list中，数组长度大的数组靠前)
*/

import java.util.ArrayList;

public class FindPath {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> allpaths = new ArrayList<>();
    ArrayList<Integer> onepath = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return allpaths;
        }
        findPath(root, target);
        return allpaths;
    }

    private void findPath(TreeNode root, int target) {
        //首先加入根节点
        onepath.add(root.val);
        if (root.val == target && root.left == null && root.right == null) {
            //因为是全局变量。此处需要重新创建一个对象保存当前路径
            allpaths.add(new ArrayList<>(onepath));
        }
        //如果有左右孩子。继续遍历直到为空才比较值
        if (root.left != null) {
            findPath(root.left, target - root.val);
        }
        if (root.right != null) {
            findPath(root.right, target - root.val);
        }
        //回溯，恢复onepath去查找另外一条路径是否满足、
        onepath.remove(onepath.size() - 1);
        return;
    }

}
