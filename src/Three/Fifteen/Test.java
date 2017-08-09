package Three.Fifteen;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        for(int i = 200 ; i <= 500 ; i++){
            boolean b = true;
            for(int j = 2 ; j < (i/2) ; j++){
                if(i % j == 0){
                    b = false;
                    break;
                }
            }
            if(!b){
                    continue;
                }
            System.out.print(i + " ");
            break;
        }
    }
}
