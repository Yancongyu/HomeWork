package Four.Eight;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数，用英文逗号隔开");
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < num.length ; i++){
            num[i] = Integer.parseInt(su[i]);
        }
        for(int j = num.length-1 ; j >= 0 ; j--){
            System.out.print(num[j] + " ");
        }
    }
}
