package Four.Six;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test{
    public static void main(String[]args){
        int num[] = {1,2,9,10,15,45};
        System.out.println("请输入你想插入的数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0 ; i < num.length ; i++){
            if(a <= num[i]){
                System.out.print(a + " ");
                for(int j = i; j < num.length ; j++){
                    System.out.print(num[j] + " ");
                }
                break;
            }
            else if(a >= num[num.length-1]){
                for(int k = 0 ; k < num.length ; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.print(a);
                break;
            }
            System.out.print(num[i] + " ");
        }
    }
}
