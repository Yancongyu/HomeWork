package Four.Two;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String[]args){
        double[][] num = new double[5][5];
        for(int  i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[i].length ; j++){
                num[i][j] = Math.random();
                System.out.println("num[" + i + "][" + j + "]" + "的值为" + num[i][i]);
            }
        }
    }
}
