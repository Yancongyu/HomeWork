package Third.Seventh;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入基数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入次数");
        int num = sc.nextInt();
        int sum = 0;
        int b= 0;
        if(num > 0){
            for(int i = 1 ; i < num; i++) {
                b += (int) (a * Math.pow(10.0, (double)(i)));
                sum = sum + (b+a);
            }
            System.out.print(sum+a);
        }
        else{System.out.println("输入错误");}
    }
}
