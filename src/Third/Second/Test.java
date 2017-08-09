package Third.Second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public static void main(String []args)
    {
        System.out.println("请输入年月日，用英文-隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String su[] = si.split("-");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ; i++)
        {
            num[i] = Integer.parseInt(su[i]);
        }
        System.out.println("你输入的是" + num[0] + "年" + num[1] + "月" + num[2] + "日");
        int day = 0;
        switch(num[1]-1)
        {
            //case 12:
            //day += 31;
            case 11:
                day += 30;
            case 10:
                day +=31;
            case 9:
                day += 30;
            case 8:
                day += 31;
            case 7:
                day += 31;
            case 6:
                day += 30;
            case 5:
                day += 31;
            case 4:
                day += 30;
            case 3:
                day += 31;
            case 2:
                if((num[0]% 4 == 0 && num[0] % 100 != 0) || num[0] % 400==0)
                    {
                        day += 29;
                    }
                else
                {
                    day += 28;
                }
            case 1:
                day += 31;
            default:
            break;
        }
        System.out.println("你输入的是" + num[0] + "年的第" + (day + num[2]) + "天");
    }
}
