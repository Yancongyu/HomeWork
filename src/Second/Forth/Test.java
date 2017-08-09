package Second.Forth;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 0 && a <= 1000){
            int t = a/1000;
            int h = (a%1000)/100;
            int te = (a%100)/10;
            int g = a%10;
            int result = t + h + te + g;
            System.out.println(result);
        }
    }
}
