package Two.Five;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public double transF(double c){
        double F = c*9/5+32;
        return F;
    }
    public double transC(double f){
        double C = (f-32)*5/9;
        return C;
    }
    public static void main(String[]args){
        double result = 0;
        System.out.println("请输入你想转换的华氏度(F)");
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        result = t.transC(Double.parseDouble(sc.next()));
        System.out.println("转换成摄氏度为" + result);
        System.out.println("请输入你想转换的摄氏度(C)");
        result = t.transF(Double.parseDouble(sc.next()));
        System.out.println("转换成华氏度为" + result);
    }
}
