package Third.Seventeenth;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        int a,b;
        for(int i = 0 ; i < 10000 ; i++){
            a = (int)Math.sqrt(i+100);
            b = (int)Math.sqrt(i+168);
            if((a*a == (i+100)) && (b*b == (i+168))){
                System.out.println(a + " " + b + " " + i);
            }
        }
    }
}
