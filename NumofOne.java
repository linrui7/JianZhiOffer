/*
   Author:linrui
   Date:2019/8/11
   Content:
   输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/

public class NumofOne {


    public int NumberOf1(int n) {
        return Integer.bitCount(n);
    }

    public int NumberOf2(int n) {
        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }

    public int NumberOf3(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}
