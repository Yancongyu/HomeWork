package ChCollection.Second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class hh {
    public static void main(String[]args){
        String Dw[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String Dw1[] = {"十","百","千"};
        String Dw2[] = { "角", "分"};
        String Dw3[] = {"万" , "亿"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要转换的数字");
        float num = Float.parseFloat(sc.next());
        String s = String.valueOf(num);
        String[] result = new String[2 * s.length()];
        int dotpos = s.indexOf(".");
        String s1 = null;//整数
        if(dotpos == -1){
            s1 = s.substring(0,s.length());
        }
        else{
            s1 = s.substring(0,dotpos);
        }
        s = s.substring(dotpos+1);//小数


        int j = 0;

        if(s1.length() <= 4){
            for(int i = 0 ; i < s1.length()-1 ; i++){
                int n = Integer.parseInt(s1.substring(i,i+1));
                result[j] = Dw[n];
                j = i+1;
                result[j] = Dw1[i];
                j++;
            }
            for(String r : result){
                System.out.print(r);
            }
        }
    }
}
