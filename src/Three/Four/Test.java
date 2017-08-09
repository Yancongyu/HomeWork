package Three.Four;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个年份");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num % 4 == 0 && num % 100 !=0) || num % 400 == 0){
            System.out.println(num  + "年是闰年");
        }
        else{
            System.out.println(num + "年不是闰年");
        }
    }
}
