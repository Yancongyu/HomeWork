package Third.First;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public static void main(String[]args)
    {
        System.out.println("输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("你输入的两个数字分别为" + a + "  " + b);
        System.out.println("两个数较大的哪个是" + (a>b ? a:b));
        //int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

    }
}
