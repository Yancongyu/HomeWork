package Second.Second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test {
    public static void main(String[]args){
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int i = a << b;
        System.out.println("a<<b" + " "  +i);
        int j = (int)(a * Math.pow(2.0,(double)b));
        System.out.println("a*2的b次方" + " " + j);
        int k = a >> b;
        System.out.println("a>>b" + " " + k);
        int l = (int)(a / Math.pow(2.0,(double)b));
        System.out.println("a/2的b次方" + " " + l);
    }
}
