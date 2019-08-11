/*
   Author:linrui
   Date:2019/8/11
   Content:
   在一个二维数组中（每个一维数组的长度相同），
   每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
   请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/

public class ArraySelectV {
    public boolean Find(int target, int[][] array) {
        if (array[0].length == 0 || array.length == 0) {
            return false;
        }
        //行row
        int length = array.length;
        //列col
        int higth = array[0].length;
        //从右上角开始遍历，如果比它小。在第一行的左边。比它大。往下走一行继续比较
        int i = length - 1;
        int j = 0;
        while (i >= 0 && j < higth) {
            if (target < array[i][j]) {
                i--;
            } else if (target > array[i][j]) {
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
