package Four.Seven;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String[]args){
        int max = 0 ;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数组，用英文逗号隔开");
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ; i++){
            num[i] = Integer.parseInt(su[i]);
        }
        for(int i = 0 ; i < num.length ; i++){
           if(num[i] > max){
               max = num[i];
           }
            if(num[i] < min){
                min = num[i];
            }
        }
        for(int i = 0 ; i < num.length ; i++){
            if(num[i] == max){
                num[i] = num[0];
                num[0] = max;
            }
            if(num[i] == min){
                num[i] = num[num.length-1];
                num[num.length-1] = min;
            }
        }
        for(int i = 0 ; i < num.length ; i++){
            System.out.print(num[i] + " ");
        }
    }
}
