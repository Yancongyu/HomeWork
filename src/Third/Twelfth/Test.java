package Third.Twelfth;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String []args){
        int i = 0;
        int j;
        while(i < 200){
            j = 0;
            while(j < 200){
                j++;
                int a = (int)Math.pow((double)i,2.0) + j;
                int b = (int)Math.pow((double)j,2.0) + i;
                if(a==1053 && b==873){
                    System.out.print(i+" "+j);
                }
            }
            i++;
        }
    }
}
