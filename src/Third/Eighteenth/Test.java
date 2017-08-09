package Third.Eighteenth;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    private int account = 0;
    public void dolt(int month){
        if(month >= 0 && month < 3){
            account += 1;
        }
        else{
            account += 1;
            int a = month - 2;
            for(int i = 0 ; i < a ; i++){
                dolt(a-i);
            }
        }
    }
    public static void main(String[]args){
        System.out.println("输入月数");
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        t.dolt(sc.nextInt());
        System.out.println("数量为" + t.account*2 + "只" + "\t" + t.account + "对");
    }
}
