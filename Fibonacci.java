/*
   Author:linrui
   Date:2019/8/11
   Content:
   大家都知道斐波那契数列，现在要求输入一个整数n，
   请你输出斐波那契数列的第n项（从0开始，第0项为0）。
*/

public class Fibonacci {
    public int Fibonacci1(int n) {
        if(n==0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    public int Fibonacci(int n) {
       int pre=1;
       int prepre=0;
       int res=0;
       if (n==0){
           return 0;
       }
       if(n==1){
           return 1;
       }
       //从第三个数开始才有规律 1 1 2 3 5 8
       for(int i=2;i<=n;i++){
        res=pre+prepre;
        prepre=pre;
        pre=res;
       }
       return res;
    }
}
