/*
   Author:linrui
   Date:2019/8/15
   Content:
   输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
   如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

    后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），如果去掉最后一个元素的序列为T，
    那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。
*/

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }
        //首先找到左右子树。然后进行递归
        return isBST(sequence, 0, sequence.length - 1);
    }

    //最后一个为根。左子树比根小。右子树比根大
    private boolean isBST(int[] sequence, int start, int end) {
        //结束条件。start都等于end了还没有找到错误的数
        if (start >= end) {
            return true;
        }
        //找到比根小的下标
        //那么它前面的数应该都比根小
        int i = end;
        while (sequence[i] < sequence[end]) {
            i--;
        }
        for (int j = start; j < i - 1; j++) {
            if (sequence[j] > sequence[end]) {
                return false;
            }
        }
        //递归开始，最后一个数为根 总是符合前半部分小于最后一个，后半部分大于最后一个
        return isBST(sequence, start, i - 1) && isBST(sequence, i, end - 1);
    }
}
