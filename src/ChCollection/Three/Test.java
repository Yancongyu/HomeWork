package ChCollection.Three;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String[]args){
        int[] num = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            int j = (int)(Math.random()*100);
            num[i] = j;
        }
        Arrays.sort(num);
        for(int n : num){
            System.out.println(n);
        }
    }
}
