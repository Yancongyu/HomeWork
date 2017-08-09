package Three.Seven;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入三角形的三边用英文逗号隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        double[] num = new double[3];
        for(int i = 0 ; i < 3 ; i++){
            num[i] = Double.parseDouble(su[i]);
        }
        Arrays.sort(num);
        //System.out.println(num[0] + " " + num[1] + " " + num[2]);
        if((num[0] + num[1] > num[2]) &&(num[2] - num[1] < num[0])){
            if(num[0] == num[1] && num[2] == num[1]){
                System.out.println("等边三角形");
            }
            else if((num[0] == num[1] && num[1] != num[2]) || (num[1] == num[2] && num[0] != num[1])){
                System.out.println("等腰三角形");
            }
            else if(num[0] * num[0] + num[1] * num[1] == num[2] * num[2]){
                System.out.println("直角三角形");
            }
        }
        else{
            System.out.println("不能构成三角形");
        }
    }
}