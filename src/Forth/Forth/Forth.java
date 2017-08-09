package Forth.Forth;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Forth {
    public static void main(String []args){
        int[][] a = {{2,3,4},{4,6,8}};
        int[][] b = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        for(int i = 0 ; i < a.length ; i++)//a的2行
        {
            for(int j = 0 ; j < b[0].length ; j ++)//b的4列
            {
                int sum = 0;
                for (int k = 0 ; k < b.length ; k++)//b的3行,a的3列
                {
                    sum += a[i][k] * b[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.print("\n");
        }
    }
}
