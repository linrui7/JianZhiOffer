/*
   Author:linrui
   Date:2019/8/30
   Content:
   输入一个递增排序的数组和一个数字S，在数组中查找两个数，
   使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
*/

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array == null || array.length < 2) {
            return arrayList;
        }
        int i = 0, j = array.length - 1;
        //前后往中间找，靠的越远乘积越小
        while (i < j) {
            if (array[i] + array[j] == sum) {
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                return arrayList;
                //如果相加的数过大，则右边下标往中间移动
            } else if (array[i] + array[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
        return arrayList;
    }
}
