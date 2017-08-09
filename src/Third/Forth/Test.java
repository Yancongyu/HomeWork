package Third.Forth;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void c(int num){
        int k = 2;
        if(num == 1 || num == 2 || num == 3){
            System.out.println(num + "=" + num + "*1");
        }
        else if(num <= 0){
            System.out.println("没意义");
        }
        else if(num >=4){
            while(k <= num)
            {
                if(num % k  == 0)
                {
                    System.out.print(k + " ");
                    num /= k;
                }
                else k++;
            }
        }
    }
    public static void main(String[]args){
        System.out.println("请输入需要运算的数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a + "的质因数为");
        new Test().c(a);
    }
}