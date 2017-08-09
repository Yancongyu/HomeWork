package Three.Forteen;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for(int i = num ; i > 0; i--){
            sum *= i;
        }
        System.out.println(num + "的阶乘为" + sum);
    }
}
