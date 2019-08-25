/*
   Author:linrui
   Date:2019/8/25
   Content:
   输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
   打印能拼接出的所有数字中最小的一个。
   例如输入数组
   {3，32，321}，则打印出这三个数字能排成的
   最小 321 3 23
*/

import java.util.Arrays;
import java.util.Comparator;

public class PrintArrayMin {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length == 0) {
            return "";
        }
        int length = numbers.length;
        String[] strings = new String[length];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + "" + o2;
                String str2 = o2 + "" + o1;
                return str1.compareTo(str2);
            }
        });
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }
}
