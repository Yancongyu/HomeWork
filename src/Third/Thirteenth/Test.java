package Third.Thirteenth;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Test{
    public static void main(String[]args){
        int x = 1;
        int y = 2048;
        int a = x;
        int b = y;
        int temp;
        for(; x < y; x ++){
            if(y % x == 0){
                temp = y / x;
                if((temp + x) < (a + b)){
                    a = x;
                    b = temp;
                }
            }
        }
        System.out.println("a:" + a + ",b:" + b);
    }
}
