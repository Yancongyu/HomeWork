package Three.Ten;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        double reward = 0,money;
        System.out.println("请输入利润");
        Scanner sc = new Scanner(System.in);
        money = Double.parseDouble(sc.next());
        if(money > 0 && money <= 10){
            reward = money * 0.1;
        }
        else if (money > 10 && money <=20){
            reward = (money - 10) * 0.075 + 10 * 0.1;
        }
        else if(money > 20 && money <= 40){
            reward = (money - 20) * 0.05 + 10 * 0.075 + 10 * 0.1;
        }
        else if(money > 40 && money <= 60){
            reward = (money - 40) * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        }
        else if(money > 60 && money <= 100){
            reward = (money - 60) * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        }
        else if(money >= 100){
            reward = (money - 100) * 0.01 + 40 * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        }
        else{
            System.out.println("输入错误");
        }
        System.out.println("奖金是" + reward);
    }
}
