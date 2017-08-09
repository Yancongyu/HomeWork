package Four.One;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public static void main(String[]args){
        int num[] = new int[5];
        for(int i = 0 ; i < num.length ; i++){
                num[i] = (i+1) * 10;
                System.out.println((i+1) + " " + num[i]);
        }
    }
}
