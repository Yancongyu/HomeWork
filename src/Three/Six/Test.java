package Three.Six;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入三个数字用英文逗号隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ; i++){
            num[i] = Integer.parseInt(su[i]);
        }
        Arrays.sort(num);
        for(int j = num.length-1 ; j >= 0 ; j--){
            System.out.print(num[j] + " ");
        }
    }
}
