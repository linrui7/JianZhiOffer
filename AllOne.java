/*
   Author:linrui
   Date:2019/8/20
   Content:
   出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
*/

import java.math.BigInteger;

public class AllOne {
    public static void main(String[] args) {
      int n=  NumberOf1Between1AndN_Solution(2100);
        System.out.println(n);
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            sb.append(String.valueOf(i));
        }
        System.out.println(sb);
        String str = sb.toString();
        int big = str.length();
        str = str.replaceAll("1", "");
        System.out.println(str);
        int len = big - str.length();
        return len;
    }
}
