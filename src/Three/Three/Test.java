package Three.Three;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num % 5 == 0) && (num % 6 == 0)){
            System.out.println("可同时被5和6整除");
        }
        else if((num % 5 == 0) && (num % 6 !=0)){
            System.out.println("只能被5整除");
        }
        else if((num % 5 != 0) && (num % 6 == 0)){
            System.out.println("只能被6整除");
        }
        else{
            System.out.println("不能被5或6整除");
        }
    }
}
