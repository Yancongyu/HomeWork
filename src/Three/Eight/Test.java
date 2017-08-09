package Three.Eight;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("输入一个正整数");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split("");
        int[] num = new int[su.length];
        if(num.length <= 5){
            for(int i = 0 ; i < su.length ; i++){
                num[i] = Integer.parseInt(su[i]);
            }
            System.out.println("是" + num.length + "位数字");
            System.out.println("每一位数字是");
            for(int i = 0 ; i < su.length ; i++){
                System.out.print(num[i] + " ");
            }
        }
        else{
            System.out.println("数字超过题目要求");
        }
    }
}
