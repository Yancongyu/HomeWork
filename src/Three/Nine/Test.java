package Three.Nine;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public double getFee(double fee){
        double money = 0;
        if(fee < 100 && fee > 0){
            money = 1;
        }
        else if(fee >= 100 && fee < 5000){
            money = fee * 0.01;
        }
        else if(fee >= 5000){
            money = 50;
        }
        System.out.println("汇费为" + money);
        return money;
    }
    public static void main(String[]args){
        System.out.println("请输入汇款金额");
        Scanner sc = new Scanner(System.in);
        double fee = Double.parseDouble(sc.next());
        new Test().getFee(fee);
    }
}
