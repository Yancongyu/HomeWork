package Four.Ten;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public void Bubble(int[]num){
        int temp = 0;
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num.length-1 ; j++){
                 if(num[j+1] < num[j]){
                     temp = num[j];
                     num[j] = num[j+1];
                     num[j+1] = temp;
                 }
            }
        }
        for(int i = 0 ; i < num.length ; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[]args){
        System.out.println("请输入需要排序的数字,用英文逗号隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        int[] num = new int[su.length];
        for(int i = 0 ; i < num.length ; i++){
            num[i] = Integer.parseInt(su[i]);
        }
        Test t = new Test();
        t.Bubble(num);
    }
}
