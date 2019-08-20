/*
   Author:linrui
   Date:2019/8/20
   Content:
   {6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
   给一个数组，返回它的最大连续子序列的和
*/

public class MaxOfArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int total = array[0];
            int maxSum = array[0];
            for (int i = 1; i < array.length; i++) {
                //如果前一个值的数为负数。那么没什么用。加上了反而会使整体变小。
                //记录下现在的值
                if (total > 0) {
                    total = total + array[i];
                } else {
                    total = array[i];
                }
                //找到当前最大的值。
                if (total > maxSum) {
                    maxSum = total;
                }
            }
            return maxSum;
        }
    }
}
