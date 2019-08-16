/*
   Author:linrui
   Date:2019/8/16
   Content:数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
   由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
*/


import java.util.Arrays;
import java.util.HashMap;

public class LenthThanHalf {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        //找到中间的数
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length / 2]) {
                count++;
            }
        }
        //如果长度超过一半就返回。
        if (count > array.length / 2) {
            return array[array.length / 2];
        }
        return 0;
    }

    public int MoreThanHalfNum_Solution2(int[] array) {
        //将遍历到的每个数都保存在map中。
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == null) {
                hashMap.put(array[i], 1);
            } else {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
        }
        for(int i=0;i<array.length;i++){
            if(hashMap.get(array[i])>array.length/2){
                return array[i];
            }
        }
        return 0;
    }


}
