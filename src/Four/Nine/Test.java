package Four.Nine;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数，用英文逗号隔开");
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < su.length ; i++){
            num[i] = Integer.parseInt(su[i]);
        }
        for(int j = 0 ; j < num.length ; j++){
            for(int k = j+1 ; k < num.length ; k++){
                if(num[j] == num[k]){
                    num[j] = 0;
                }
            }
            System.out.print(num[j] + " ");
        }
    }
}