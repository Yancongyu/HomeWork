package Forth.First;

/**
 * Created by Administrator on 2017/6/13.
 */
public class First {
    public static void main(String []args)
    {
        int[] a = new int[10];
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++)
        {
            a[i] = (int)(Math.random()*10);
            sum += a[i];
        }
        int avg = sum/10;
        System.out.println(avg);
    }
}
