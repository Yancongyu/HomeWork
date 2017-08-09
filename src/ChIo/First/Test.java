package ChIo.First;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
        int[] num = new int[20];
        for(int i = 0 ; i < 20 ; i++){
            num[i] = (int)(Math.random()*10);
        }
        LinkedList<Integer> l = new LinkedList<>();
        for(int i = 0 ; i < 20 ; i++){
            if(num[i] % 2 != 0){
                l.add(num[i]);
            }
            else{
                if(l.size() == 0){}
                else{
                    l.removeFirst();
                }
            }
        }
        for(int i : l){
            System.out.println(i);
        }
    }
}
