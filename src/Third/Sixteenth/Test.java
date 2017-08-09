package Third.Sixteenth;

import java.util.*;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Test{
    public static void main(String[]args){
        int     a ,b,m;
        Scanner s = new Scanner(System.in);
        System.out.println( "键入一个整数： ");
        a = s.nextInt();
        System.out.println( "再键入一个整数： ");
        b = s.nextInt();
        // new 一个类 目的是调用类中的方法 deff
        deff d = new deff();
        // 调用类中的方法 deff 获得最大公约数
        m = d.deff(a,b);
        // 计算最小公倍数 ，这个纯粹是数学知识
        int n = a * b / m;
        System.out.println("最大公约数: " + m);
        System.out.println("最小公倍数: " + n);
    }
}
