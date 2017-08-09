package ChCollection.Second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String args[]) {
        String Dw[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String Dw1[] = {"拾", "佰", "仟", "万", "拾万", "百万", "仟万", "亿", "拾亿", "百亿", "仟亿"};
        String Dw2[] = { "角", "分"};
        //定义单位

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要转换的数字");
        //接收键盘数据

        float num = Float.parseFloat(sc.nextLine());

        String s = String.valueOf(num);

        int dotPos = s.indexOf('.');
        String s1 = null;

        if (dotPos == -1) {
            s1 = s.substring(0,s.length());
        }else {
            s1 = s.substring(0,dotPos);
        }
        //截取整数部分

        s = s.substring(dotPos + 1);
        //截取小数部分


        StringBuffer result = new StringBuffer(s.length());//定义小数部分精度

        if (s.length() <= 2) {



            int x=Integer.valueOf(s1);

            String Trans[] = new String[50];//用于存储转换之后的数字
            int a = 0, j, k = -1, i = 0;//a用于存放第几个需要转换的数字

            while (x != 0) {
                a = (int) (x % 10L);
                for (j = 0; j < Dw.length; j++) {
                    if (j == a) break;
                }
                if (k != -1) {
                    Trans[i] = Dw1[k];
                    i++;
                }
                Trans[i] = Dw[j];
                i++;
                x = x / 10;
                k++;

                if (x == 0) {
                    //输出转换后的金额
                    System.out.print("您输入的金额为：");
                    i--;
                    for (; i >= 0; i--)
                        System.out.print(Trans[i]);
                    for(int l = 0;l<s.length();l++){
                        result.append(Dw[s.charAt(l)-48]);
                        result.append(Dw2[l]);
                    }
                    System.out.println("元"+result);
                }

            }
        }
        else {System.out.println("你输入的不符合要求");
        }

    }
}
