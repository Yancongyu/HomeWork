package ChContainer.Four;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Util {
    static Scanner sc = new Scanner(System.in);
    static DateBase db = new DateBase();

    public static void show(){
        while(true){
            System.out.println("-------");
            System.out.println("1：插入");
            System.out.println("2：查询");
            System.out.println("3：修改");
            System.out.println("4：删除");
            System.out.println("其他退出");

            int i = sc.nextInt();
            switch(i){
                case 1:db.insertStudent();
                    break;
                case 2:select();
                    break;
                case 3:db.updateStudent();
                    break;
                case 4:db.deleteStudent();
                    break;
                default:System.out.println(0);
            }
        }
    }
    public static void select(){
        System.out.println("输入查询方式：1.单行查询 2：全表查询");
        int i = sc.nextInt();
        switch (i){
            case 1:db.selectStudent();break;
            case 2:db.selectAll();break;
            default:System.out.println(0);
        }
    }
}
