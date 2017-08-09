package Third.Eleventh;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test{
    public static void main(String[]args){
        int i = 0;
        int j ;
        int temp = 0;
        while (i<5){
            j=0;
            while(j<=i){
                temp++;
                System.out.print(temp + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
