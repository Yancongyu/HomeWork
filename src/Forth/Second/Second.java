package Forth.Second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Second{
    public void Yang(int num){
        int [][]a = new int[num][];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = new int[i+1];
            a[i][0] = 1;
            a[i][i] = 1;
            for(int j = 0 ; j < a[i].length-1 ; j++) {
                if(j >= 1 && i > 1) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        for(int i = 0 ;i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        new Second().Yang(num);
    }
}
