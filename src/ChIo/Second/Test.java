package ChIo.Second;

import java.util.*;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
        System.out.println("请输入单词，用英文空格隔开");
        Scanner sc = new Scanner(System.in);
        String si = sc.next();
        String[] su = si.split(",");
        List<String> l = new LinkedList<>();
        for(int i = 0 ; i < su.length ; i++){
            l.add(su[i]);
        }
        Collections.sort(l);
        for(String s : l){
            System.out.println(s);
        }
    }
}
