package Forth.Third;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Third {
    public static void main(String []args) {
        System.out.println("请输入一组数据用英文逗号隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0; i < su.length ; i++){
            num[i] = Integer.parseInt(su[i]);
            System.out.print(num[i] + " ");
        }
        System.out.println("\n" + "请输入你想移动的位数");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("移动之后");
        if(a >= 0 && a <= num.length){
            for(int j = a; j < num.length;j++){
                System.out.print(num[j] + " ");
            }
            for(int i = 0 ; i < a ;i++){
                System.out.print(num[i] + " ");
            }
        }
        else if(a > num.length){
            int aa = a % num.length;
            for(int j = aa; j < num.length;j++){
                System.out.print(num[j] + " ");
            }
            for(int i = 0 ; i < aa ;i++){
                System.out.print(num[i] + " ");
            }
        }
        else{System.out.println("输入错误");}
    }
}
