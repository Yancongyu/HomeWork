package ChCollection.First;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String[] args) {
        String str = "我ABC汉DEF汉G";
        System.out.println(str);
        while(true){
            System.out.println("请输入要截取字节长度");
            Scanner input = new Scanner(System.in);
            int len = input.nextInt();
            byte[] b = str.getBytes();
            if(len == -1 || len == 0)
                break;
            else if(len > 0 && len <= b.length-2){
                if(b[len-1] < 0){
                    if(b[len]<0 && b[len+1] <0){
                        len = len - 1;
                    }
                    else if(b[len] < 0 && b[len+1] > 0){
                        len = len - 2;
                    }
                }
            }
            else if(len > b.length -2){
                if(len == b.length -1){
                    if(len < 0){
                        len = len - 2;
                    }
                }
            }
            String show = new String(b,0, len);
            System.out.println(show);
        }
    }
}
