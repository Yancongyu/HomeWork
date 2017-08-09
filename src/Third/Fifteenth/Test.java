package Third.Fifteenth;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Test{
    public static void main(String[]args){
        float sum = 0.000f;
        float n = 0.000f;
        int h = 100;
        for(int i = 0 ; i < 5 ; i++){
            sum += h + h/2;
            h = h/2;
            n = h;
        }
        System.out.println(sum + " " + n);
    }
}
