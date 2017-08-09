package ChContainer.Three;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String []args){
        ArrayList al = new ArrayList();
        al.add("apple");
        al.add("grape");
        al.add("banana");
        al.add("pear");

        System.out.println("最大的是" + Collections.max(al));
        System.out.println("最小的是" + Collections.min(al));

    }
}
