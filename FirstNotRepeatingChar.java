/*
   Author:linrui
   Date:2019/8/25
   Content:
   在一个字符串(0<=字符串长度<=10000，全部由字母组成)中
   找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
*/

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] arr = new int[58];
        //65-90  97-122  123-65
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65] += 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)-65] == 1) {
                return i;
            }
        }
        return -1;

    }
}
