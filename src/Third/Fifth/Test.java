package Third.Fifth;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String[]args){
    for(int i = 100 ; i <= 999 ; i++){
        int h = i/100;
        int te = (i%100)/10;
        int g = i%10;
        if(h*h*h + te*te*te + g*g*g == i){
            System.out.println(i);
        }
    }
    }
}
