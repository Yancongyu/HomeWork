package Four.Three;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String[]args){
        System.out.println("请输入复制源，用英文逗号隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next().toString();
        String[] su = si.split(",");
        String[] copyFrom = new String[su.length];
        for(int i = 0 ; i < su.length ; i++){
            copyFrom[i] = su[i];
            //System.out.print(copyFrom[i] + " ");
        }
        String[] copyTo = new String[copyFrom.length];
        for(int j = 0 ; j < copyFrom.length ; j++){
            copyTo[j] = copyFrom[j];
            System.out.print(copyTo[j] + " ");
        }
    }
}