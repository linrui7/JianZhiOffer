/*
   Author:linrui
   Date:2019/8/11
   Content:
   把一个数组最开始的若干个元素搬到数组的末尾，
   我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
   输出旋转数组的最小元素。
   例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
   该数组的最小值为1。
   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/

public class RoundMinnum {
    public int minNumberInRotateArray(int[] array) {
        int low = 0;
        int hight = array.length - 1;
        while (low < hight) {
            int mid = low + ((hight - low) >> 2);
            //中间大于最后边，数应该在右边
            if (array[mid] > array[hight]) {
                low = mid + 1;
                //中间和后面相等。继续找。
            } else if (array[mid] == array[hight]) {
                hight = hight - 1;
            } else {
                hight = mid;
            }
        }
        return array[low];
    }
}
