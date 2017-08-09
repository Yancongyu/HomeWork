package Third.Ninteenth;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        int i = 1;
        int account = 1;
        while(i <= 10){
            System.out.println("第" + (11-i) + "天有" + account + "个");
            account = (account+1)*2;
            i++;
        }
    }
}
