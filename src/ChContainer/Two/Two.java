package ChContainer.Two;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */
public class Two {
    public Two(){}

    List<Object> l = new LinkedList();
    public void put(Object o){
        l.add(o);
    }

    public Object get(){
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return null;
    }

    public boolean isEmpty(){
        if(l.isEmpty()){
            System.out.println("队列是空的");
            return true;
        }
        else{
            System.out.println("队列不为空");
            return false;
        }
    }
}
