package Second.Fifth;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入大写字母");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("小写为" + "\n" + a.toLowerCase());
    }
}
