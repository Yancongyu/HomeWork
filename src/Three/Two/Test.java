package Three.Two;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println(num);
        }
        else if(num == 5){
            System.out.println(num);
        }
        else if(num == 10){
            System.out.println(num);
        }
        else{
            System.out.println("none");
        }
    }
}
