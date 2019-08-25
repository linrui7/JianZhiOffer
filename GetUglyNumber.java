/*
   Author:linrui
   Date:2019/8/25
   Content:
   丑数 只由1 2 3 5  乘积组成的数排序
   1,2,3,4(2*2),5

   所有的数都应该是等于 2**j * 3**K * 5**m
*/

import java.util.ArrayList;
import java.util.List;

public class GetUglyNumber {
    public static void main(String[] args) {
        GetUglyNumber_Solution(10);
    }
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while (list.size() < index) {
            int min2 = list.get(index2) * 2;
            int min3 = list.get(index3) * 3;
            int min5 = list.get(index5) * 5;
            //比较这三个数那个大
            //第一次三个数都是0
            int min = Math.min(min2, Math.min(min3, min5));
            list.add(min);
            if (min == min2) {
                index2++;
            }
            if (min == min3) {
                index3++;
            }
            if (min == min5) {
                index5++;
            }

        }
        return list.get(list.size()-1);
    }
}
