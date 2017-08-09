package Third.Third;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public static void main(String[]args)
    {
        System.out.println("请输入数字用英文空格分开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ;i++)
        {
            num[i] = Integer.parseInt(su[i]);
            System.out.print(num[i] + " ");
        }
        System.out.print("\n"+"反转之后" + "\n");
        for(int j = su.length-1 ; j >= 0 ; j--)
        {
            System.out.print(num[j] + " ");
        }
    }
}
