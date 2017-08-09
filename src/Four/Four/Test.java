package Four.Four;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一串数字，用英文逗号隔开");
        String si  = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ; i++){
            num[i] = Integer.parseInt(su[i]);
            //System.out.print(num[i] + " ");
        }
        Arrays.sort(num);
        for(int j = 0 ; j < num.length ; j++){
            System.out.print(num[j] + " ");
        }
    }
}
