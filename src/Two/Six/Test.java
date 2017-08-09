package Two.Six;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("转换前" + ": a=" + a + " " + "b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("转换后" + ": a=" + a + " " + "b=" + b);
    }
}
