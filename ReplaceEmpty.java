/*
   Author:linrui
   Date:2019/8/11
   Content:
   请实现一个函数，将一个字符串中的每个空格替换成“%20”。
   例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/

public class ReplaceEmpty {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }
}
