package ChCollection.Four;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Test {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str1 = s.nextLine();
        System.out.print("请输入子串：");
        String str2 = s.nextLine();
        int count=0;
        if(str1.equals("")||str2.equals("")){
            System.out.println("你没有输入字符串或子串,无法比较!");
            System.exit(0);
        }
        else{
            for(int i=0;i<=str1.length()-str2.length();i++){
                if(str2.equals(str1.substring(i, str2.length()+i)))
                    count++;
            }
            System.out.println("子串在字符串中出现: "+count+" 次");
        }
    }
}
