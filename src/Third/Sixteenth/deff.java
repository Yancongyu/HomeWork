package Third.Sixteenth;

/**
 * Created by Administrator on 2017/6/20.
 */
public class deff{
    public int deff(int a,int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int k ;
        while(min != 0){
            if(min == max){
                return min;
            }
            else{
                k = max % min ;
                max = min;
                min = k;
            }
        }
    return max;
    }
}
