package ChCollection.One;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String[]args){
        System.out.println("请输入一串英文");
        Scanner sc = new Scanner(System.in);
        String si = sc.next();
        String[] su = si.split("");
        int la = su.length;
        List l = new ArrayList<>();
        for(int i = 0 ; i < su.length ; i++){
            l.add(su[i]);
        }

        for(int i = 0 ; i < su.length ; i++){
            l.remove("e");
        }

        int ll = l.size();
        System.out.println("有" + (la-ll) + "个e");
    }
}
