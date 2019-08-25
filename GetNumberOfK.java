/*
   Author:linrui
   Date:2019/8/25
   Content:
   统计一个数字在排序数组中出现的次数。
*/

public class GetNumberOfK {

    public static void main(String[] args) {
        System.out.println(GetNumberOfK1(new int[]{1, 3, 3, 3,3,4, 5}, 6));
    }

    public static int GetNumberOfK(int[] array, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        int length = stringBuilder.toString().length() - stringBuilder.toString().replaceAll(String.valueOf(k), "").length();
        return length;
    }

    //二分查找法
    public static int GetNumberOfK1(int[] array, int k) {
        int indexStart = getStart(array, k, 0, array.length-1);
        int indexEnd = getEnd(array, k, 0, array.length-1);
        System.out.println(indexStart);
        System.out.println(indexEnd);
        if (indexEnd != -1 && indexEnd != -1) {
            return indexEnd - indexStart + 1;
        }
        return 0;
    }

    private static int getStart(int[] array, int k, int start, int end) {

            while (start <= end) {
                int mid = (start + end) >> 1;
                if (k < array[mid])
                    end = mid - 1;
                else if (k > array[mid])
                    start = mid + 1;
                else if ((mid > 0 && array[mid - 1] != k) || mid == 0)
                    return mid;
                else {
                    end = mid - 1;
                }
            }
        return -1;
    }


    private static int getEnd(int[] array, int k, int start, int end) {
        while (start <= end) {
            int mid = (start + end) >>1;
            if (k < array[mid])
                end = mid - 1;
            else if (k > array[mid])
                start = mid + 1;
            else if ((mid < array.length - 1 && array[mid + 1] != k) || mid == array.length - 1)
                return mid;

            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
