package ChContainer.One;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/13.
 */
public class One {
    public static void main(String []args){
        System.out.println("请输入一串英文");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String[] su = st.split("");
        List<String> l= new ArrayList<>();
        for(int i = 0 ; i < su.length ; i++){
            for(int j = 0 ; j < su.length ; j++){
                if(su[i].compareToIgnoreCase(su[j]) > 0){
                    st = su[i];
                    su[i] = su[j];
                    su[j] = st;
                }
            }
        }
        for(String so : su){
            l.add(so);
        }
            System.out.println(l);
    }
}
