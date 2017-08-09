package Second.Third;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 9999 && a < 100000)
        {
            System.out.println(a/100 + "百");
        }
        else{System.out.println("输入错误");}
    }
}
