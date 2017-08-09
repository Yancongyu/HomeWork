package Third.Forteenth;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Test{
    public static void main(String[]args){
        int n = 0;
        for(int i  = 0 ; i < 4 ; ++i){
            for(int j = 0 ; j < 4 ; ++j){
                for(int k = 0 ; k < 4 ; ++k){
                    if(i != j && j != k && k != i && ++n != 0){
                        System.out.println("第" + n + "个组合为" + i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("一共有" + n + "种");
    }
}
