package Three.Five;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入一个成绩");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()/10;
        String str = null;
        if(a >= 0 && a <= 10){
            switch (a){
                case 0:
                    str = "H";
                    break;
                case 1:
                    str = "G";
                    break;
                case 2:
                    str = "F";
                    break;
                case 3:
                    str = "E";
                    break;
                case 4:
                    str = "D";
                    break;
                case 5:
                    str = "C";
                    break;
                case 6:
                    str = "B";
                    break;
                case 7:
                    str = "B";
                    break;
                case 8:
                    str = "B";
                    break;
                case 9:
                    str = "A";
                    break;
                case 10:
                    str = "A";
                    break;
                default:
            }
            System.out.println(str);
        }
        else{
            System.out.println("输入的分数无效");
        }
    }
}
