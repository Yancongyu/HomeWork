package Three.One;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个需要判断的数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a + "是偶数");
        }
        else{
            System.out.println(a + "是奇数");
        }
    }
}
