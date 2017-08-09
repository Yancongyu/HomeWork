package Three.Thirteen;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()/10;
        String str = "";
        switch (a){
            case 10:
                str = "A";
                break;
            case 9:
                str = "A";
                break;
            case 8:
                str = "B";
                break;
            case 7:
                str = "C";
                break;
            case 6:
                str = "D";
                break;
            default:
                str = "E";
                break;
        }
        System.out.println(str);
    }
}
